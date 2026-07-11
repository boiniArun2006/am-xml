package NDY;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml extends Pl {

    private enum j {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    @Override // NDY.Pl, com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        if (jVar == com.google.zxing.j.CODE_128) {
            return super.n(str, jVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(jVar)));
    }

    private static int J2(CharSequence charSequence, int i2, int i3) {
        j jVarUo;
        j jVarUo2;
        char cCharAt;
        j jVarUo3 = Uo(charSequence, i2);
        j jVar = j.ONE_DIGIT;
        if (jVarUo3 == jVar) {
            return 100;
        }
        j jVar2 = j.UNCODABLE;
        if (jVarUo3 == jVar2) {
            if (i2 >= charSequence.length() || ((cCharAt = charSequence.charAt(i2)) >= ' ' && (i3 != 101 || cCharAt >= '`'))) {
                return 100;
            }
            return 101;
        }
        if (i3 == 99) {
            return 99;
        }
        if (i3 == 100) {
            j jVar3 = j.FNC_1;
            if (jVarUo3 == jVar3 || (jVarUo = Uo(charSequence, i2 + 2)) == jVar2 || jVarUo == jVar) {
                return 100;
            }
            if (jVarUo == jVar3) {
                if (Uo(charSequence, i2 + 3) != j.TWO_DIGITS) {
                    return 100;
                }
                return 99;
            }
            int i5 = i2 + 4;
            while (true) {
                jVarUo2 = Uo(charSequence, i5);
                if (jVarUo2 != j.TWO_DIGITS) {
                    break;
                }
                i5 += 2;
            }
            if (jVarUo2 == j.ONE_DIGIT) {
                return 100;
            }
            return 99;
        }
        if (jVarUo3 == j.FNC_1) {
            jVarUo3 = Uo(charSequence, i2 + 1);
        }
        if (jVarUo3 != j.TWO_DIGITS) {
            return 100;
        }
        return 99;
    }

    private static j Uo(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        if (i2 >= length) {
            return j.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt == 241) {
            return j.FNC_1;
        }
        if (cCharAt >= '0' && cCharAt <= '9') {
            int i3 = i2 + 1;
            if (i3 >= length) {
                return j.ONE_DIGIT;
            }
            char cCharAt2 = charSequence.charAt(i3);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                return j.TWO_DIGITS;
            }
            return j.ONE_DIGIT;
        }
        return j.UNCODABLE;
    }

    @Override // NDY.Pl
    public boolean[] t(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int iRl = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                switch (cCharAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (cCharAt > 127) {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                        }
                        break;
                        break;
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i3 = 0;
            int i5 = 0;
            int i7 = 0;
            int i8 = 1;
            while (true) {
                int i9 = 103;
                if (i3 < length) {
                    int iJ2 = J2(str, i3, i7);
                    int iCharAt = 100;
                    if (iJ2 == i7) {
                        switch (str.charAt(i3)) {
                            case 241:
                                iCharAt = 102;
                                break;
                            case 242:
                                iCharAt = 97;
                                break;
                            case 243:
                                iCharAt = 96;
                                break;
                            case 244:
                                if (i7 == 101) {
                                    iCharAt = 101;
                                }
                                break;
                            default:
                                if (i7 == 100) {
                                    iCharAt = str.charAt(i3) - ' ';
                                } else if (i7 != 101) {
                                    iCharAt = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                } else {
                                    char cCharAt2 = str.charAt(i3);
                                    iCharAt = cCharAt2 - ' ';
                                    if (iCharAt < 0) {
                                        iCharAt = cCharAt2 + '@';
                                    }
                                }
                                break;
                        }
                        i3++;
                    } else {
                        if (i7 == 0) {
                            if (iJ2 != 100) {
                                if (iJ2 != 101) {
                                    i9 = 105;
                                }
                            } else {
                                i9 = 104;
                            }
                        } else {
                            i9 = iJ2;
                        }
                        iCharAt = i9;
                        i7 = iJ2;
                    }
                    arrayList.add(w6.f6997n[iCharAt]);
                    i5 += iCharAt * i8;
                    if (i3 != 0) {
                        i8++;
                    }
                } else {
                    int[][] iArr = w6.f6997n;
                    arrayList.add(iArr[i5 % 103]);
                    arrayList.add(iArr[106]);
                    int i10 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i11 : iArr2) {
                            i10 += i11;
                        }
                    }
                    boolean[] zArr = new boolean[i10];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        iRl += Pl.rl(zArr, iRl, (int[]) it.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
