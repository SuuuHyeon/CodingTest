class Solution {
    fun solution(newId: String): String {
        // 1. 소문자 치환
        var castedId: String = newId.lowercase()

        // 2. 허용 특수문자 제외
        val charLimitList = "~!@#$%^&*()=+[{]}:?,<>/".toList() // 허용 문자 리스트
        for (i in charLimitList) {
            castedId = castedId.filterNot { it == i } // 제한문자와 같다면 제거한 후 필터링
        }

        // 3. .가 2번 이상 연속된 부분을 .하나로 치환
        while (castedId.contains("..")) {
            for (i in castedId.indices) {
                if (castedId[i] == '.' && castedId[i + 1] == '.') {
                    castedId = castedId.replaceRange(i..i + 1, ".")
                    break
                }
            }
        }

        // 4. 처음과 끝의 .를 제거
        castedId = castedId.removePrefix(".")
        castedId = castedId.removeSuffix(".")

        // 5. 빈 문자열인지 체크
        if (castedId.isEmpty()) castedId = "a"

        // 6. castedId의 길이가 16 이상이면 15개 이후 문자 모두 제거
        // 제거 후 마지막 문자가 .일 경우 .제거
        if (castedId.length >= 16) {
            castedId = castedId.substring(0, 15).removeSuffix(".")
        }

        // 7. castedId의 길이가 2자 이하라면,
        // 마지막 문자를 길이가 3이 될때까지 반복해서 끝에 붙이기
        while (castedId.length < 3) {
            castedId = castedId.plus(castedId.last())
        }


        return castedId
    }
}