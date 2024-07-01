object demo extends App{

    var str="Hello"
    var len=str.length()

    def reverse(str1:String,len1:Int):Unit=len1 match{
        case x if(len1>=0)=>print(str1(len1))
        reverse(str1,len1-1)

        case _=>println("")
    }
    reverse(str,len-1)
}