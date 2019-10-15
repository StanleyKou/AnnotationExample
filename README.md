# 안드로이드 애노테이션 프로세싱 예제



#### ViewBinder - bindViewsJava
bindViewsJava 는 Java 에서 Reflection 을 이용하여 Annotation 을 활용하는 방식을 구현한 예제입니다.

#### ViewBinder - bindViewsKotlin 
bindViewsKotlin 은 Kotlin 에서 Reflection 이용하여 Annotation 을 활용하는 방식을 구현한 예제입니다.

#### binder-compiler
binder-compiler 는 Java poet 을 이용하여 annotationProcessor 를 구현한 예제입니다. 
주의: Java poet 라이브러리는 Kotlin 파일에서 제대로 동작하지 않으니,(ap_generated_sources 가 생성되지 않음) 
Kotlin 파일에서 annotationProcessor 를 만들고 싶은 경우 Kotlin poet(https://github.com/square/kotlinpoet) 을 이용하세요.  


이 예제는 아래 링크를 기초로 몇 가지를 덧붙여 만들었습니다.

### The links to the tutorials:
1. [Part 1 : A practical approach](https://mindorks.com/blog/android-annotation-processing-tutorial-part-1-a-practical-approach)
2. [Part 2: The project structure](https://mindorks.com/blog/android-annotation-processing-tutorial-part-2-the-project-structure)
3. [Part 3: Generate Java source code](https://mindorks.com/blog/android-annotation-processing-tutorial-part-3-generate-java-source-code)
4. [Part 4: Use the generated code](https://mindorks.com/blog/android-annotation-processing-tutorial-part-4-use-the-generated-code)



원 저작자는 MINDORKS NEXTGEN PRIVATE LIMITED 이며, 관련 소스는 Apache 2.0으로 배포되어 있고, 원 저작물에 대한 권한은 모두 원 저작자에게 있습니다.


### License
```
   Copyright 2019 Stanley Ko
   
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
   
       http://www.apache.org/licenses/LICENSE-2.0
   
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
