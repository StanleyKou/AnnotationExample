package com.kou.annotationexample

@Target(AnnotationTarget.PROPERTY)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class BindViewKotlin(val value: Int)