package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class OpReorderer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Callback f41142n;

    interface Callback {
        AdapterHelper.UpdateOp n(int i2, int i3, int i5, Object obj);

        void rl(AdapterHelper.UpdateOp updateOp);
    }

    private void t(List list, int i2, AdapterHelper.UpdateOp updateOp, int i3, AdapterHelper.UpdateOp updateOp2) {
        int i5 = updateOp.nr;
        int i7 = updateOp2.rl;
        int i8 = i5 < i7 ? -1 : 0;
        int i9 = updateOp.rl;
        if (i9 < i7) {
            i8++;
        }
        if (i7 <= i9) {
            updateOp.rl = i9 + updateOp2.nr;
        }
        int i10 = updateOp2.rl;
        if (i10 <= i5) {
            updateOp.nr = i5 + updateOp2.nr;
        }
        updateOp2.rl = i10 + i8;
        list.set(i2, updateOp2);
        list.set(i3, updateOp);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void J2(List list, int i2, AdapterHelper.UpdateOp updateOp, int i3, AdapterHelper.UpdateOp updateOp2) {
        AdapterHelper.UpdateOp updateOpN;
        int i5;
        int i7;
        int i8 = updateOp.nr;
        int i9 = updateOp2.rl;
        AdapterHelper.UpdateOp updateOpN2 = null;
        if (i8 >= i9) {
            int i10 = updateOp2.nr;
            if (i8 < i9 + i10) {
                updateOp2.nr = i10 - 1;
                updateOpN = this.f41142n.n(4, updateOp.rl, 1, updateOp2.f40969t);
            }
            i5 = updateOp.rl;
            i7 = updateOp2.rl;
            if (i5 > i7) {
                updateOp2.rl = i7 + 1;
            } else {
                int i11 = updateOp2.nr;
                if (i5 < i7 + i11) {
                    int i12 = (i7 + i11) - i5;
                    updateOpN2 = this.f41142n.n(4, i5 + 1, i12, updateOp2.f40969t);
                    updateOp2.nr -= i12;
                }
            }
            list.set(i3, updateOp);
            if (updateOp2.nr <= 0) {
                list.set(i2, updateOp2);
            } else {
                list.remove(i2);
                this.f41142n.rl(updateOp2);
            }
            if (updateOpN != null) {
                list.add(i2, updateOpN);
            }
            if (updateOpN2 == null) {
                list.add(i2, updateOpN2);
                return;
            }
            return;
        }
        updateOp2.rl = i9 - 1;
        updateOpN = null;
        i5 = updateOp.rl;
        i7 = updateOp2.rl;
        if (i5 > i7) {
        }
        list.set(i3, updateOp);
        if (updateOp2.nr <= 0) {
        }
        if (updateOpN != null) {
        }
        if (updateOpN2 == null) {
        }
    }

    void O(List list, int i2, AdapterHelper.UpdateOp updateOp, int i3, AdapterHelper.UpdateOp updateOp2) {
        boolean z2;
        int i5 = updateOp.rl;
        int i7 = updateOp.nr;
        boolean z3 = false;
        if (i5 < i7) {
            if (updateOp2.rl == i5 && updateOp2.nr == i7 - i5) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
            }
        } else if (updateOp2.rl == i7 + 1 && updateOp2.nr == i5 - i7) {
            z2 = true;
            z3 = true;
        } else {
            z2 = true;
        }
        int i8 = updateOp2.rl;
        if (i7 < i8) {
            updateOp2.rl = i8 - 1;
        } else {
            int i9 = updateOp2.nr;
            if (i7 < i8 + i9) {
                updateOp2.nr = i9 - 1;
                updateOp.f40968n = 2;
                updateOp.nr = 1;
                if (updateOp2.nr == 0) {
                    list.remove(i3);
                    this.f41142n.rl(updateOp2);
                    return;
                }
                return;
            }
        }
        int i10 = updateOp.rl;
        int i11 = updateOp2.rl;
        AdapterHelper.UpdateOp updateOpN = null;
        if (i10 <= i11) {
            updateOp2.rl = i11 + 1;
        } else {
            int i12 = updateOp2.nr;
            if (i10 < i11 + i12) {
                updateOpN = this.f41142n.n(2, i10 + 1, (i11 + i12) - i10, null);
                updateOp2.nr = updateOp.rl - updateOp2.rl;
            }
        }
        if (z3) {
            list.set(i2, updateOp2);
            list.remove(i3);
            this.f41142n.rl(updateOp);
            return;
        }
        if (z2) {
            if (updateOpN != null) {
                int i13 = updateOp.rl;
                if (i13 > updateOpN.rl) {
                    updateOp.rl = i13 - updateOpN.nr;
                }
                int i14 = updateOp.nr;
                if (i14 > updateOpN.rl) {
                    updateOp.nr = i14 - updateOpN.nr;
                }
            }
            int i15 = updateOp.rl;
            if (i15 > updateOp2.rl) {
                updateOp.rl = i15 - updateOp2.nr;
            }
            int i16 = updateOp.nr;
            if (i16 > updateOp2.rl) {
                updateOp.nr = i16 - updateOp2.nr;
            }
        } else {
            if (updateOpN != null) {
                int i17 = updateOp.rl;
                if (i17 >= updateOpN.rl) {
                    updateOp.rl = i17 - updateOpN.nr;
                }
                int i18 = updateOp.nr;
                if (i18 >= updateOpN.rl) {
                    updateOp.nr = i18 - updateOpN.nr;
                }
            }
            int i19 = updateOp.rl;
            if (i19 >= updateOp2.rl) {
                updateOp.rl = i19 - updateOp2.nr;
            }
            int i20 = updateOp.nr;
            if (i20 >= updateOp2.rl) {
                updateOp.nr = i20 - updateOp2.nr;
            }
        }
        list.set(i2, updateOp2);
        if (updateOp.rl != updateOp.nr) {
            list.set(i3, updateOp);
        } else {
            list.remove(i3);
        }
        if (updateOpN != null) {
            list.add(i2, updateOpN);
        }
    }

    OpReorderer(Callback callback) {
        this.f41142n = callback;
    }

    private int n(List list) {
        boolean z2 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((AdapterHelper.UpdateOp) list.get(size)).f40968n == 8) {
                if (z2) {
                    return size;
                }
            } else {
                z2 = true;
            }
        }
        return -1;
    }

    private void nr(List list, int i2, int i3) {
        AdapterHelper.UpdateOp updateOp = (AdapterHelper.UpdateOp) list.get(i2);
        AdapterHelper.UpdateOp updateOp2 = (AdapterHelper.UpdateOp) list.get(i3);
        int i5 = updateOp2.f40968n;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 4) {
                    return;
                }
                J2(list, i2, updateOp, i3, updateOp2);
                return;
            }
            O(list, i2, updateOp, i3, updateOp2);
            return;
        }
        t(list, i2, updateOp, i3, updateOp2);
    }

    void rl(List list) {
        while (true) {
            int iN = n(list);
            if (iN != -1) {
                nr(list, iN, iN + 1);
            } else {
                return;
            }
        }
    }
}
