package com.oscar.sweet_wallet.model

data class Producto (var id: Int,
                     var unidades_envase:  String,
                     var estatus: String,
                     var nombre :String, var nombre_generico: String,
                     var forma_farmaceutica: String,
                     var unidad_medida: String,
                     var presentacion: String, var principal_indicacion: String,
                     var contra_indicaciones: String,
                     var concentracion: String,
                     var foto: String,
                     var ruta_foto: String,
                     var codigo_barras: String,
                     var precio_compra: Float,
                     var precio_venta: Float){ }