package co4;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class aC implements l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f43852n;

    public aC(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f43852n = string;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aC) && Intrinsics.areEqual(this.f43852n, ((aC) obj).f43852n);
    }

    public int hashCode() {
        return this.f43852n.hashCode();
    }

    @Override // co4.Xo
    public q6b.I28 n() {
        return new q6b.w6(this.f43852n);
    }

    @Override // co4.Xo
    public stX.eO rl() {
        String strSubstring;
        List listBuild;
        if (this.f43852n.length() == 0) {
            listBuild = CollectionsKt.emptyList();
        } else {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            String strSubstring2 = "";
            if (fm.Ml.rl(this.f43852n.charAt(0))) {
                String strSubstring3 = this.f43852n;
                int length = strSubstring3.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (!fm.Ml.rl(strSubstring3.charAt(i2))) {
                        strSubstring3 = strSubstring3.substring(0, i2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        break;
                    }
                    i2++;
                }
                listCreateListBuilder.add(new stX.fuX(CollectionsKt.listOf(new stX.n(strSubstring3))));
                String str = this.f43852n;
                int length2 = str.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        strSubstring = "";
                        break;
                    }
                    if (!fm.Ml.rl(str.charAt(i3))) {
                        strSubstring = str.substring(i3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    i3++;
                }
            } else {
                strSubstring = this.f43852n;
            }
            if (strSubstring.length() > 0) {
                if (fm.Ml.rl(strSubstring.charAt(strSubstring.length() - 1))) {
                    int lastIndex = StringsKt.getLastIndex(strSubstring);
                    while (true) {
                        if (-1 >= lastIndex) {
                            break;
                        }
                        if (!fm.Ml.rl(strSubstring.charAt(lastIndex))) {
                            strSubstring2 = strSubstring.substring(0, lastIndex + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            break;
                        }
                        lastIndex--;
                    }
                    listCreateListBuilder.add(new stX.z(strSubstring2));
                    int lastIndex2 = StringsKt.getLastIndex(strSubstring);
                    while (true) {
                        if (-1 >= lastIndex2) {
                            break;
                        }
                        if (!fm.Ml.rl(strSubstring.charAt(lastIndex2))) {
                            strSubstring = strSubstring.substring(lastIndex2 + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            break;
                        }
                        lastIndex2--;
                    }
                    listCreateListBuilder.add(new stX.fuX(CollectionsKt.listOf(new stX.n(strSubstring))));
                } else {
                    listCreateListBuilder.add(new stX.z(strSubstring));
                }
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        }
        return new stX.eO(listBuild, CollectionsKt.emptyList());
    }

    public String toString() {
        return "ConstantFormatStructure(" + this.f43852n + ')';
    }
}
