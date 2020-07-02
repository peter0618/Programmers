// Question.
// 문자열 두 개가 주어졌을 떄, 두 번째 문자열의 모든 문자를 포함하는 첫 번째 문자열의 부분 문자열을 모두 찾아 문자열과 시작 위치를 출력하시오.
// 다시 말해 첫 번째 문자열의 부분 문자열이 두 번째 문자열의 아나그램인 경우를 모두 찾으시오.

const X = "XYYZXZYZXXYZ";
const Y = "XYZ";

const targetSet = new Set([...Y]);

for(let i = 0; i < X.length -2 ; i++){
  const compSet = new Set([...X.substr(i, Y.length)]);
  const difference = new Set(
    [...targetSet].filter(x => !compSet.has(x)));
  if(difference.size === 0){
    console.log(`${X.substr(i, Y.length)}, ${i}`)
  }
}

// Output:
// YZX, 2
// XZY, 4
// YZX, 6
// XYZ, 9
