package day1014

fun main() {
    var arr = Array(5,{CharArray(15,{' '})})
    var input =""
    var result = ""
    var maxSize = 0
    for(i in 0 until 5){
        input = readLine().toString()
        arr[i] = input.toCharArray()
        maxSize = maxOf(maxSize, input.length) //이게 뭐지 ..?
    }

    for(i in 0 until maxSize){
        for(j in 0 until 5){
            if(arr[j].getOrNull(i) ==null){
                continue
            }
            result += arr[j][i]
        }
    }
    print(result)
}