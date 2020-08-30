package com.example.kotlinlog

//
import android.util.Log

//class　今いるクラス　：継承するクラス  ,think.ktから持ってきたthinkableインタフェース
//thinkableが分からない…
class Human:Animal,Thinkable {
    var hobby: String

//superは他のクラスからの継承
//コンストラクタとはクラスからインスタンスが生成されるときに呼び出される初期化のためのメソッドです
//
    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        //superはname,ageをAnimalから探しに行ってるらしいよ。
        this.hobby = hobby

    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
        /*
        Log.d：DEBUG（デバック情報）
        Log.v: VERVOSE(全てのログ情報)
        Log.i: INFO(情報)
        Log.w: WARN(警告)
        Log.e: ERROR(致命的な問題)
         */
    }

    //別のクラスで定義されている関数を使う際はoverrideを使う
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")


    }

}