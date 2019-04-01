#!/bin/sh -e

test_miniintr() {
    EXPECT=$1
    RESULT=`java -ea miniintr.MiniInterpreter "$2"`
    if [ "$EXPECT" != "$RESULT" ]; then
        echo "Error in \"$2\", (Exp: ${EXPECT}, Act: ${RESULT})"
    else
        printf "O"
    fi
}

make all

cd ..
test_miniintr "0" "0"
test_miniintr "1" "1"
test_miniintr "9" "9"
test_miniintr "10" "10"
test_miniintr "3" "+ 1 2"
test_miniintr "279" "+ 12 267"
test_miniintr "22" "- 24 2"
test_miniintr "48" "* 2 24"
test_miniintr "12" "/ 24 2"
echo ""
