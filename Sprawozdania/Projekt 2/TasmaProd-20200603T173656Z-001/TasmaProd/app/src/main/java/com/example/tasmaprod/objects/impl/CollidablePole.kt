package com.example.tasmaprod.objects.impl

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import com.example.tasmaprod.objects.IDrawable

class CounterPole(var x : Float, var y : Float, val id : Int, var width : Float = 10.0f, var height : Float = 400.0f) : IDrawable {

    var counter = 0

    override fun draw(canvas: Canvas) {
            var paint = Paint()
            paint.color = Color.argb(255, 123, 123, 123)
            paint.textSize = 80f
            canvas.drawText("Boxes: $counter", x - 3 * width, y + 100f, paint)
            canvas.drawRect(RectF(x, y,x - width,y - height), Paint().apply { color = Color.GREEN })
    }
}