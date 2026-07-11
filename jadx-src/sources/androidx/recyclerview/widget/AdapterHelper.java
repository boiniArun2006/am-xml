package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import com.safedk.android.analytics.brandsafety.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class AdapterHelper implements OpReorderer.Callback {
    final boolean J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Runnable f40965O;
    final OpReorderer Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Pools.Pool f40966n;
    final Callback nr;
    final ArrayList rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ArrayList f40967t;

    interface Callback {
        RecyclerView.ViewHolder J2(int i2);

        void KN(int i2, int i3);

        void O(int i2, int i3, Object obj);

        void Uo(int i2, int i3);

        void n(int i2, int i3);

        void nr(int i2, int i3);

        void rl(UpdateOp updateOp);

        void t(UpdateOp updateOp);
    }

    static final class UpdateOp {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f40968n;
        int nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f40969t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateOp)) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            int i2 = this.f40968n;
            if (i2 != updateOp.f40968n) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.nr - this.rl) == 1 && this.nr == updateOp.rl && this.rl == updateOp.nr) {
                return true;
            }
            if (this.nr != updateOp.nr || this.rl != updateOp.rl) {
                return false;
            }
            Object obj2 = this.f40969t;
            if (obj2 != null) {
                if (!obj2.equals(updateOp.f40969t)) {
                    return false;
                }
            } else if (updateOp.f40969t != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f40968n * 31) + this.rl) * 31) + this.nr;
        }

        String n() {
            int i2 = this.f40968n;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : l.f62657l;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + n() + ",s:" + this.rl + "c:" + this.nr + ",p:" + this.f40969t + "]";
        }

        UpdateOp(int i2, int i3, int i5, Object obj) {
            this.f40968n = i2;
            this.rl = i3;
            this.nr = i5;
            this.f40969t = obj;
        }
    }

    AdapterHelper(Callback callback) {
        this(callback, false);
    }

    boolean XQ(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.rl.add(n(2, i2, i3, null));
        this.KN |= 2;
        return this.rl.size() == 1;
    }

    boolean Z(int i2, int i3, int i5) {
        if (i2 == i3) {
            return false;
        }
        if (i5 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.rl.add(n(8, i2, i3, null));
        this.KN |= 8;
        return this.rl.size() == 1;
    }

    int az(int i2) {
        return ty(i2, 0);
    }

    boolean o(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.rl.add(n(1, i2, i3, null));
        this.KN |= 1;
        return this.rl.size() == 1;
    }

    boolean r(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.rl.add(n(4, i2, i3, obj));
        this.KN |= 4;
        return this.rl.size() == 1;
    }

    AdapterHelper(Callback callback, boolean z2) {
        this.f40966n = new Pools.SimplePool(30);
        this.rl = new ArrayList();
        this.f40967t = new ArrayList();
        this.KN = 0;
        this.nr = callback;
        this.J2 = z2;
        this.Uo = new OpReorderer(this);
    }

    private void J2(UpdateOp updateOp) {
        boolean z2;
        byte b2;
        int i2 = updateOp.rl;
        int i3 = updateOp.nr + i2;
        byte b4 = -1;
        int i5 = i2;
        int i7 = 0;
        while (i5 < i3) {
            if (this.nr.J2(i5) != null || KN(i5)) {
                if (b4 == 0) {
                    gh(n(2, i2, i7, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                b2 = 1;
            } else {
                if (b4 == 1) {
                    S(n(2, i2, i7, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                b2 = 0;
            }
            if (z2) {
                i5 -= i7;
                i3 -= i7;
                i7 = 1;
            } else {
                i7++;
            }
            i5++;
            b4 = b2;
        }
        if (i7 != updateOp.nr) {
            rl(updateOp);
            updateOp = n(2, i2, i7, null);
        }
        if (b4 == 0) {
            gh(updateOp);
        } else {
            S(updateOp);
        }
    }

    private boolean KN(int i2) {
        int size = this.f40967t.size();
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = (UpdateOp) this.f40967t.get(i3);
            int i5 = updateOp.f40968n;
            if (i5 == 8) {
                if (ty(updateOp.nr, i3 + 1) == i2) {
                    return true;
                }
            } else if (i5 == 1) {
                int i7 = updateOp.rl;
                int i8 = updateOp.nr + i7;
                while (i7 < i8) {
                    if (ty(i7, i3 + 1) == i2) {
                        return true;
                    }
                    i7++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void S(UpdateOp updateOp) {
        this.f40967t.add(updateOp);
        int i2 = updateOp.f40968n;
        if (i2 == 1) {
            this.nr.Uo(updateOp.rl, updateOp.nr);
            return;
        }
        if (i2 == 2) {
            this.nr.nr(updateOp.rl, updateOp.nr);
            return;
        }
        if (i2 == 4) {
            this.nr.O(updateOp.rl, updateOp.nr, updateOp.f40969t);
        } else {
            if (i2 == 8) {
                this.nr.n(updateOp.rl, updateOp.nr);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    private void Uo(UpdateOp updateOp) {
        int i2 = updateOp.rl;
        int i3 = updateOp.nr + i2;
        int i5 = 0;
        byte b2 = -1;
        int i7 = i2;
        while (i2 < i3) {
            if (this.nr.J2(i2) != null || KN(i2)) {
                if (b2 == 0) {
                    gh(n(4, i7, i5, updateOp.f40969t));
                    i7 = i2;
                    i5 = 0;
                }
                b2 = 1;
            } else {
                if (b2 == 1) {
                    S(n(4, i7, i5, updateOp.f40969t));
                    i7 = i2;
                    i5 = 0;
                }
                b2 = 0;
            }
            i5++;
            i2++;
        }
        if (i5 != updateOp.nr) {
            Object obj = updateOp.f40969t;
            rl(updateOp);
            updateOp = n(4, i7, i5, obj);
        }
        if (b2 == 0) {
            gh(updateOp);
        } else {
            S(updateOp);
        }
    }

    private void gh(UpdateOp updateOp) {
        int i2;
        int i3 = updateOp.f40968n;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iNY = nY(updateOp.rl, i3);
        int i5 = updateOp.rl;
        int i7 = updateOp.f40968n;
        if (i7 == 2) {
            i2 = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i2 = 1;
        }
        int i8 = 1;
        for (int i9 = 1; i9 < updateOp.nr; i9++) {
            int iNY2 = nY(updateOp.rl + (i2 * i9), updateOp.f40968n);
            int i10 = updateOp.f40968n;
            if (i10 == 2 ? iNY2 != iNY : !(i10 == 4 && iNY2 == iNY + 1)) {
                UpdateOp updateOpN = n(i10, iNY, i8, updateOp.f40969t);
                qie(updateOpN, i5);
                rl(updateOpN);
                if (updateOp.f40968n == 4) {
                    i5 += i8;
                }
                i8 = 1;
                iNY = iNY2;
            } else {
                i8++;
            }
        }
        Object obj = updateOp.f40969t;
        rl(updateOp);
        if (i8 > 0) {
            UpdateOp updateOpN2 = n(updateOp.f40968n, iNY, i8, obj);
            qie(updateOpN2, i5);
            rl(updateOpN2);
        }
    }

    private int nY(int i2, int i3) {
        int i5;
        int i7;
        for (int size = this.f40967t.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = (UpdateOp) this.f40967t.get(size);
            int i8 = updateOp.f40968n;
            if (i8 == 8) {
                int i9 = updateOp.rl;
                int i10 = updateOp.nr;
                if (i9 < i10) {
                    i7 = i9;
                    i5 = i10;
                } else {
                    i5 = i9;
                    i7 = i10;
                }
                if (i2 < i7 || i2 > i5) {
                    if (i2 < i9) {
                        if (i3 == 1) {
                            updateOp.rl = i9 + 1;
                            updateOp.nr = i10 + 1;
                        } else if (i3 == 2) {
                            updateOp.rl = i9 - 1;
                            updateOp.nr = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i3 == 1) {
                        updateOp.nr = i10 + 1;
                    } else if (i3 == 2) {
                        updateOp.nr = i10 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        updateOp.rl = i9 + 1;
                    } else if (i3 == 2) {
                        updateOp.rl = i9 - 1;
                    }
                    i2--;
                }
            } else {
                int i11 = updateOp.rl;
                if (i11 <= i2) {
                    if (i8 == 1) {
                        i2 -= updateOp.nr;
                    } else if (i8 == 2) {
                        i2 += updateOp.nr;
                    }
                } else if (i3 == 1) {
                    updateOp.rl = i11 + 1;
                } else if (i3 == 2) {
                    updateOp.rl = i11 - 1;
                }
            }
        }
        for (int size2 = this.f40967t.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = (UpdateOp) this.f40967t.get(size2);
            if (updateOp2.f40968n == 8) {
                int i12 = updateOp2.nr;
                if (i12 == updateOp2.rl || i12 < 0) {
                    this.f40967t.remove(size2);
                    rl(updateOp2);
                }
            } else if (updateOp2.nr <= 0) {
                this.f40967t.remove(size2);
                rl(updateOp2);
            }
        }
        return i2;
    }

    boolean HI(int i2) {
        return (i2 & this.KN) != 0;
    }

    boolean Ik() {
        return (this.f40967t.isEmpty() || this.rl.isEmpty()) ? false : true;
    }

    public int O(int i2) {
        int size = this.rl.size();
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = (UpdateOp) this.rl.get(i3);
            int i5 = updateOp.f40968n;
            if (i5 != 1) {
                if (i5 == 2) {
                    int i7 = updateOp.rl;
                    if (i7 <= i2) {
                        int i8 = updateOp.nr;
                        if (i7 + i8 > i2) {
                            return -1;
                        }
                        i2 -= i8;
                    } else {
                        continue;
                    }
                } else if (i5 == 8) {
                    int i9 = updateOp.rl;
                    if (i9 == i2) {
                        i2 = updateOp.nr;
                    } else {
                        if (i9 < i2) {
                            i2--;
                        }
                        if (updateOp.nr <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (updateOp.rl <= i2) {
                i2 += updateOp.nr;
            }
        }
        return i2;
    }

    void ViF() {
        aYN(this.rl);
        aYN(this.f40967t);
        this.KN = 0;
    }

    void WPU() {
        this.Uo.rl(this.rl);
        int size = this.rl.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) this.rl.get(i2);
            int i3 = updateOp.f40968n;
            if (i3 == 1) {
                t(updateOp);
            } else if (i3 == 2) {
                J2(updateOp);
            } else if (i3 == 4) {
                Uo(updateOp);
            } else if (i3 == 8) {
                nr(updateOp);
            }
            Runnable runnable = this.f40965O;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.rl.clear();
    }

    boolean ck() {
        return this.rl.size() > 0;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public UpdateOp n(int i2, int i3, int i5, Object obj) {
        UpdateOp updateOp = (UpdateOp) this.f40966n.acquire();
        if (updateOp == null) {
            return new UpdateOp(i2, i3, i5, obj);
        }
        updateOp.f40968n = i2;
        updateOp.rl = i3;
        updateOp.nr = i5;
        updateOp.f40969t = obj;
        return updateOp;
    }

    void qie(UpdateOp updateOp, int i2) {
        this.nr.rl(updateOp);
        int i3 = updateOp.f40968n;
        if (i3 == 2) {
            this.nr.KN(i2, updateOp.nr);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.nr.O(i2, updateOp.nr, updateOp.f40969t);
        }
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void rl(UpdateOp updateOp) {
        if (this.J2) {
            return;
        }
        updateOp.f40969t = null;
        this.f40966n.n(updateOp);
    }

    int ty(int i2, int i3) {
        int size = this.f40967t.size();
        while (i3 < size) {
            UpdateOp updateOp = (UpdateOp) this.f40967t.get(i3);
            int i5 = updateOp.f40968n;
            if (i5 == 8) {
                int i7 = updateOp.rl;
                if (i7 == i2) {
                    i2 = updateOp.nr;
                } else {
                    if (i7 < i2) {
                        i2--;
                    }
                    if (updateOp.nr <= i2) {
                        i2++;
                    }
                }
            } else {
                int i8 = updateOp.rl;
                if (i8 > i2) {
                    continue;
                } else if (i5 == 2) {
                    int i9 = updateOp.nr;
                    if (i2 < i8 + i9) {
                        return -1;
                    }
                    i2 -= i9;
                } else if (i5 == 1) {
                    i2 += updateOp.nr;
                }
            }
            i3++;
        }
        return i2;
    }

    void xMQ() {
        int size = this.f40967t.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.nr.t((UpdateOp) this.f40967t.get(i2));
        }
        aYN(this.f40967t);
        this.KN = 0;
    }

    private void nr(UpdateOp updateOp) {
        S(updateOp);
    }

    private void t(UpdateOp updateOp) {
        S(updateOp);
    }

    void aYN(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            rl((UpdateOp) list.get(i2));
        }
        list.clear();
    }

    void mUb() {
        xMQ();
        int size = this.rl.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) this.rl.get(i2);
            int i3 = updateOp.f40968n;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        if (i3 == 8) {
                            this.nr.t(updateOp);
                            this.nr.n(updateOp.rl, updateOp.nr);
                        }
                    } else {
                        this.nr.t(updateOp);
                        this.nr.O(updateOp.rl, updateOp.nr, updateOp.f40969t);
                    }
                } else {
                    this.nr.t(updateOp);
                    this.nr.KN(updateOp.rl, updateOp.nr);
                }
            } else {
                this.nr.t(updateOp);
                this.nr.Uo(updateOp.rl, updateOp.nr);
            }
            Runnable runnable = this.f40965O;
            if (runnable != null) {
                runnable.run();
            }
        }
        aYN(this.rl);
        this.KN = 0;
    }
}
