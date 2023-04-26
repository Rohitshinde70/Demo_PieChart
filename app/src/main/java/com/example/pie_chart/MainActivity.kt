package com.example.pie_chart

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chart : PieChart = findViewById(R.id.pieChart_view)

        chartView()

    }
    private fun chartView() {
        val pieChart: PieChart = findViewById(R.id.pieChart_view)

        val dataEntries: ArrayList<PieEntry> = ArrayList()
        dataEntries.add(PieEntry(200f, "January"))
        dataEntries.add(PieEntry(300f, "February"))
        dataEntries.add(PieEntry(400f, "March"))
        dataEntries.add(PieEntry(500f, "April"))


        val pieDataSet = PieDataSet(dataEntries, "Salaries Overview")
        pieDataSet.colors = ColorTemplate.COLORFUL_COLORS.toList()
        pieDataSet.valueTextColor = Color.WHITE
        pieDataSet.valueTextSize = 12f


        val pieData = PieData(pieDataSet)
        pieChart.data = pieData


        pieChart.setUsePercentValues(true)
        pieChart.description.isEnabled = false
        pieChart.setDrawHoleEnabled(true)
        pieChart.setTransparentCircleAlpha(0)
       pieChart.holeRadius = 0f
        pieChart.transparentCircleRadius = 61f
        pieChart.setDrawCenterText(true)
    //    pieChart.setCenterTextSize(16f)
     //   pieChart.setCenterText("Salaries Overview")
        pieChart.legend.isEnabled = false


        pieChart.invalidate()
    }


}

