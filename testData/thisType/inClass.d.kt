package inClass

@native
open class MyClass {
    open var self: MyClass /* this */ = noImpl
    open fun that(): MyClass /* this */ = noImpl
}
