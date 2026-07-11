package t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC2368Ml f73419n;
    private final int nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w6 f73420t;

    class j implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AbstractC2368Ml f73421n;

        /* JADX INFO: renamed from: t1.l3D$j$j, reason: collision with other inner class name */
        class C1177j extends n {
            C1177j(l3D l3d, CharSequence charSequence) {
                super(l3d, charSequence);
            }

            @Override // t1.l3D.n
            int J2(int i2) {
                return j.this.f73421n.t(this.f73423O, i2);
            }

            @Override // t1.l3D.n
            int O(int i2) {
                return i2 + 1;
            }
        }

        j(AbstractC2368Ml abstractC2368Ml) {
            this.f73421n = abstractC2368Ml;
        }

        @Override // t1.l3D.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public n n(l3D l3d, CharSequence charSequence) {
            return new C1177j(l3d, charSequence);
        }
    }

    private static abstract class n extends AbstractC2371n {
        final AbstractC2368Ml J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final CharSequence f73423O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f73424Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f73425o = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final boolean f73426r;

        abstract int J2(int i2);

        abstract int O(int i2);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // t1.AbstractC2371n
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public String n() {
            int iJ2;
            int i2 = this.f73425o;
            while (true) {
                int i3 = this.f73425o;
                if (i3 == -1) {
                    return (String) rl();
                }
                iJ2 = J2(i3);
                if (iJ2 == -1) {
                    iJ2 = this.f73423O.length();
                    this.f73425o = -1;
                } else {
                    this.f73425o = O(iJ2);
                }
                int i5 = this.f73425o;
                if (i5 == i2) {
                    int i7 = i5 + 1;
                    this.f73425o = i7;
                    if (i7 > this.f73423O.length()) {
                        this.f73425o = -1;
                    }
                } else {
                    while (i2 < iJ2 && this.J2.O(this.f73423O.charAt(i2))) {
                        i2++;
                    }
                    while (iJ2 > i2 && this.J2.O(this.f73423O.charAt(iJ2 - 1))) {
                        iJ2--;
                    }
                    if (!this.f73426r || i2 != iJ2) {
                        break;
                    }
                    i2 = this.f73425o;
                }
            }
            int i8 = this.f73424Z;
            if (i8 == 1) {
                iJ2 = this.f73423O.length();
                this.f73425o = -1;
                while (iJ2 > i2 && this.J2.O(this.f73423O.charAt(iJ2 - 1))) {
                    iJ2--;
                }
            } else {
                this.f73424Z = i8 - 1;
            }
            return this.f73423O.subSequence(i2, iJ2).toString();
        }

        protected n(l3D l3d, CharSequence charSequence) {
            this.J2 = l3d.f73419n;
            this.f73426r = l3d.rl;
            this.f73424Z = l3d.nr;
            this.f73423O = charSequence;
        }
    }

    private interface w6 {
        Iterator n(l3D l3d, CharSequence charSequence);
    }

    private l3D(w6 w6Var) {
        this(w6Var, false, AbstractC2368Ml.J2(), Integer.MAX_VALUE);
    }

    private l3D(w6 w6Var, boolean z2, AbstractC2368Ml abstractC2368Ml, int i2) {
        this.f73420t = w6Var;
        this.rl = z2;
        this.f73419n = abstractC2368Ml;
        this.nr = i2;
    }

    private Iterator Uo(CharSequence charSequence) {
        return this.f73420t.n(this, charSequence);
    }

    public static l3D O(AbstractC2368Ml abstractC2368Ml) {
        Xo.HI(abstractC2368Ml);
        return new l3D(new j(abstractC2368Ml));
    }

    public static l3D nr(char c2) {
        return O(AbstractC2368Ml.nr(c2));
    }

    public List J2(CharSequence charSequence) {
        Xo.HI(charSequence);
        Iterator itUo = Uo(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itUo.hasNext()) {
            arrayList.add((String) itUo.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public l3D KN() {
        return xMQ(AbstractC2368Ml.KN());
    }

    public l3D xMQ(AbstractC2368Ml abstractC2368Ml) {
        Xo.HI(abstractC2368Ml);
        return new l3D(this.f73420t, this.rl, abstractC2368Ml, this.nr);
    }
}
