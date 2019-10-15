package com.kou.annotationexample

import android.app.Activity
import android.view.View
import java.lang.reflect.Field
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.jvm.isAccessible

object ViewBinder {
    fun bindKotlin(target: Activity) {
        bindViewsKotlin(target, target::class.declaredMemberProperties, target.window.decorView)
    }

    private fun bindViewsKotlin(obj: Any, fields: Collection<KProperty<*>>, rootView: View) {
        for (field in fields) {
            val annotation = field.annotations.find { it is BindViewKotlin }
            if (annotation != null) {
                val bindViewKotlin = annotation as BindViewKotlin
                val view = rootView.findViewById<View>(bindViewKotlin.value)
                try {
                    field.isAccessible = true
                    if (field is KMutableProperty1<*, *>) {
                        val mutableField = field as KMutableProperty1<Any, View>
                        mutableField.set(obj, view)
                    }
                } catch (e: IllegalAccessException) {
                    e.printStackTrace()
                }
            }
        }
    }

    fun bindJava(target: Activity) {
        bindViewsJava(target, target.javaClass.declaredFields, target.window.decorView)
    }

    private fun bindViewsJava(obj: Any, fields: Array<Field>, rootView: View) {
        for (field in fields) {
            val annotation = field.getAnnotation(BindViewJava::class.java)
            if (annotation != null) {
                val view = rootView.findViewById<View>(annotation.value)
                try {
                    field.isAccessible = true
                    field.set(obj, view)
                } catch (e: IllegalAccessException) {
                    e.printStackTrace()
                }
            }
        }
    }
}
