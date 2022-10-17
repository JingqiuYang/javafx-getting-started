package org.openjfx;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;

  public class MyChart extends VBox {
        public MyChart() {
            getChildren().add(buildSampleLineChart());
        }

        public LineChart buildSampleLineChart() {
            XYChart.Series<Double,Double>series = new XYChart.Series<>();
            series.getData().add(new XYChart.Data<>(0.0, 0.0));
            series.getData().add(new XYChart.Data<>(1.0, 1.0));
            series.getData().add(new XYChart.Data<>(2.0, 2.0));
            series.getData().add(new XYChart.Data<>(3.0, 3.0));
            series.getData().add(new XYChart.Data<>( 4.0, 2.5));
            series.getData().add(new XYChart.Data<>(0.0, 30.2));
            series.getData().add(new XYChart.Data<>(0.0, 0.0));

            LineChart lc = new LineChart(
                    new NumberAxis(" Time Constant ", 0.0, 5.0, 1),
                    new NumberAxis(" Voltage (Vs) ", 0.0, 1.0, 0.1)
            );
            lc.getData().add(series);
            return lc;
        }
    }
