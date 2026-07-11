package androidx.constraintlayout.core.parser;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueNull;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class CLToken extends CLElement {
    char[] E2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    char[] f35340S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    Type f35341Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    char[] f35342g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f35343o;

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public static CLElement r(char[] cArr) {
        return new CLToken(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String Ik() {
        if (!CLParser.nr) {
            return t();
        }
        return "<" + t() + ">";
    }

    public boolean o(char c2, long j2) {
        int iOrdinal = this.f35341Z.ordinal();
        if (iOrdinal == 0) {
            char[] cArr = this.f35340S;
            int i2 = this.f35343o;
            if (cArr[i2] == c2) {
                this.f35341Z = Type.TRUE;
            } else if (this.f35342g[i2] == c2) {
                this.f35341Z = Type.FALSE;
            } else if (this.E2[i2] == c2) {
                this.f35341Z = Type.NULL;
            }
            z = true;
        } else if (iOrdinal == 1) {
            char[] cArr2 = this.f35340S;
            int i3 = this.f35343o;
            z = cArr2[i3] == c2;
            if (z && i3 + 1 == cArr2.length) {
                ty(j2);
            }
        } else if (iOrdinal == 2) {
            char[] cArr3 = this.f35342g;
            int i5 = this.f35343o;
            z = cArr3[i5] == c2;
            if (z && i5 + 1 == cArr3.length) {
                ty(j2);
            }
        } else if (iOrdinal == 3) {
            char[] cArr4 = this.E2;
            int i7 = this.f35343o;
            z = cArr4[i7] == c2;
            if (z && i7 + 1 == cArr4.length) {
                ty(j2);
            }
        }
        this.f35343o++;
        return z;
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.f35343o = 0;
        this.f35341Z = Type.UNKNOWN;
        this.f35340S = "true".toCharArray();
        this.f35342g = V8ValueBoolean.FALSE.toCharArray();
        this.E2 = V8ValueNull.NULL.toCharArray();
    }
}
