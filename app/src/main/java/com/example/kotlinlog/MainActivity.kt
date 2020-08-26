package com.example.kotlinlog
//packageによってMainActivity.ktクラスが「jp.~~」パッケージに属していることを示す。
//パッケージとはKotlinやjavaクラスをまとめる仕組みの事。

import android.support.v7.app.AppCompatActivity
//android.support.v7.appパッケージのAppCompatiActivityクラスを使用する
import android.os.Bundle
//android.osパッケージのBundleクラスを使用する
import android.util.Log
import com.example.kotlinlog.R

//android.untilパッケージのlogクラスを使用する


    /*
    class MainActivity : AppCompaActvity()とは、
    MainActivityクラスは親であるAppCompaActivityクラスの機能を引き継いでいるとの意味。
     */
    class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            //class Dog（別フォルダ）に因数（"ポチ",3）を入れる。
            val dog = Dog("ポチ",3)// 名前をポチ、3歳
            // Array<Int>型の配列が作成される
            //arrayof=コレクション

            //関数move()を引数を入れたdogを含めた状態で。
            dog.move()

        }
    }

