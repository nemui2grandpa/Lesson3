package com.example.kotlinlog

import android.util.Log

//アクセスコントロールが省略されているのでpublicとなる

open class Dog:Animal,Movable {
    //プロパティ：インスタンスが持つ属性情報のこと。
    constructor(name:String, age:Int):super(name, age) {

    }

    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」 ")
    }


    //Movableインターフェースのメソッドをオーバーライド
    override fun move(){
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }

}