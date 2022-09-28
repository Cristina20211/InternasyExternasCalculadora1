package com.example.internasyexternascalculadora

class claseAnidadyInterna {

      //clase anidad es una clase qe puede estar dentro de otra clase




      private val uno=1                      // para clase interna
      private fun retornarUno():Int{
          return uno
      }


    class miClaseAnidada{

        fun suma (n1:Int,n2:Int):Int{
            return n1+n2
        }
    }

     inner class miClaseInterna{                 //clase interna

        fun sumarDos(num:Int):Int{
            return num + uno +retornarUno()


        }



    }





}