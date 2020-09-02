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

    public class MainActivity : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
            //app conpactアクティビティ　＝根幹となるもの
            //↑ocCreate
            //

            super.onCreate(savedInstanceState)
            //savedInstanceState＝アプリ起動時に実行されるもの

            setContentView(R.layout.activity_main)
            //R.layout.activity_main
            //「savedInstanceState」を持ってこい！！って言ってる。

            //val　インスタンス = クラスのHuman (引数)
            //コンストラクターを呼び出してインスタンス化する。
            //セカンダリの場合はconstructorは省略不可

            val human =Human ("太郎",5,"ギター")
            val human2 = Human("華太郎",6,"読書")
                //say、thinkメソッドのインスタンスをふたつ作る
                human.say()
                human.think()
                human2.say()
                human2.think()

        }
    }

