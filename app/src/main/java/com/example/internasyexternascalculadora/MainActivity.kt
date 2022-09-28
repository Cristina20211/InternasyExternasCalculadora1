package com.example.internasyexternascalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var etn_Valor1:EditText?= null                                                    //inicializamos variable
    lateinit var etn_Valor2:EditText                                                  // cualquiera de las dos
    lateinit var tv_Resultado:TextView
    lateinit var rb_Suma:RadioButton
    lateinit var rb_Resta:RadioButton
    lateinit var rb_Multiplicacion:RadioButton
    lateinit var rb_Division:RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //claseAnidadyInterna()

        etn_Valor1=findViewById(R.id.etn_Valor1)
        etn_Valor2=findViewById(R.id.etn_Valor2)
        tv_Resultado=findViewById(R.id.tv_Resultado)
        rb_Suma=findViewById(R.id.rb_Suma)
        rb_Resta=findViewById(R.id.rb_Resta)
        rb_Multiplicacion=findViewById(R.id.rb_Multiplicacion)
        rb_Division=findViewById(R.id.rb_Division)
    }

    fun calcular(vista:View){

        val Valor1_String= etn_Valor1?.text.toString()                         // ? lo agregamos pra q acepte otra ves nlo
        val Valor2_String= etn_Valor2.text.toString()                          //convierte las variables en string

        val Valor1_Int=Valor1_String.toInt()                                   //conversion para utilizar los valores nmericos en enteros
        val Valor2_Int=Integer.parseInt(Valor2_String)

        if(rb_Suma.isChecked==true){

            val suma =Valor1_Int+Valor2_Int
            val resultado= suma.toString()                                                                      //convertir suma en resultado
            tv_Resultado.setText(resultado)

        }else if (rb_Resta.isChecked==true){
            val resta =Valor1_Int-Valor2_Int
            val resultado= resta.toString()                                                                      //convertir suma en resultado
            tv_Resultado.setText(resultado)

        }else if (rb_Multiplicacion.isChecked==true){

            val multiplicacion =Valor1_Int*Valor2_Int                             
            val resultado= multiplicacion.toString()                                                                      //convertir suma en resultado
            tv_Resultado.setText(resultado)
  


        }else if(rb_Division.isChecked==true){
            if(Valor2_Int !=0 && Valor1_Int !=0){
                val division =Valor1_Int/Valor2_Int
                val resultado= division.toString()                                                                      //convertir suma en resultado
                tv_Resultado.setText(resultado)

            }else{
                Toast.makeText(this, "no puede dividir por un valor 0",Toast.LENGTH_LONG).show()

            }


        }



    }


    private fun  claseAnidadyInternas(){
        //clase anidad(nester Class)

        val miClaseAnidada=claseAnidadyInterna.miClaseAnidada()
        val sumarDosNum=miClaseAnidada.suma( 5, 6)
        println("El resultado de la suma es  $sumarDosNum")


        //clase interna(Inner Class)

        val miClaseInterna1=claseAnidadyInterna().miClaseInterna()
         val sumarDos=miClaseInterna1.sumarDos(5 )
        println("El resultado de la suma dos es $sumarDos")
    }

    fun  btnSiguiente ( Vista:View){

        val  btnSiguiente:Intent=Intent()


    }




}