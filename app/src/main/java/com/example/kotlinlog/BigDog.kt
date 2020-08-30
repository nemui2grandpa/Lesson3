package com.example.kotlinlog

import android.util.Log

class BigDog: Dog {

    //superで親クラスのコンストラクトを呼ぶ
    //コンストラクタ：クラスからインスタンスが生成されるときに呼び出される初期化のためのメソッド
    //つまりはメソッドの固まり
    //constructor(引数）
    //型を指定している(name: String, age: Int)
    constructor(name: String, age :Int): super(name, age){

    }

    override fun say(){
        super.say()
        Log.d("kotlintest","大きな犬です。")
    }
}