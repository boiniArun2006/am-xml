package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: renamed from: j$.time.format.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class C2192e implements InterfaceC2193f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2193f[] f69053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f69054b;

    C2192e(ArrayList arrayList, boolean z2) {
        this((InterfaceC2193f[]) arrayList.toArray(new InterfaceC2193f[arrayList.size()]), z2);
    }

    C2192e(InterfaceC2193f[] interfaceC2193fArr, boolean z2) {
        this.f69053a = interfaceC2193fArr;
        this.f69054b = z2;
    }

    public final C2192e a() {
        return !this.f69054b ? this : new C2192e(this.f69053a, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r9.setLength(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return true;
     */
    @Override // j$.time.format.InterfaceC2193f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(y yVar, StringBuilder sb) {
        int length = sb.length();
        boolean z2 = this.f69054b;
        if (z2) {
            yVar.g();
        }
        try {
            InterfaceC2193f[] interfaceC2193fArr = this.f69053a;
            int length2 = interfaceC2193fArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    if (!interfaceC2193fArr[i2].q(yVar, sb)) {
                        break;
                    }
                    i2++;
                } else if (z2) {
                    yVar.a();
                }
            }
            return true;
        } finally {
            if (z2) {
                yVar.a();
            }
        }
    }

    @Override // j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        boolean z2 = this.f69054b;
        InterfaceC2193f[] interfaceC2193fArr = this.f69053a;
        if (z2) {
            wVar.r();
            int iS = i2;
            for (InterfaceC2193f interfaceC2193f : interfaceC2193fArr) {
                iS = interfaceC2193f.s(wVar, charSequence, iS);
                if (iS < 0) {
                    wVar.f(false);
                    return i2;
                }
            }
            wVar.f(true);
            return iS;
        }
        for (InterfaceC2193f interfaceC2193f2 : interfaceC2193fArr) {
            i2 = interfaceC2193f2.s(wVar, charSequence, i2);
            if (i2 < 0) {
                return i2;
            }
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC2193f[] interfaceC2193fArr = this.f69053a;
        if (interfaceC2193fArr != null) {
            boolean z2 = this.f69054b;
            sb.append(z2 ? "[" : "(");
            for (InterfaceC2193f interfaceC2193f : interfaceC2193fArr) {
                sb.append(interfaceC2193f);
            }
            sb.append(z2 ? "]" : ")");
        }
        return sb.toString();
    }
}
