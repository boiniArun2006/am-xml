package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class FocusStrategy {

    public interface BoundsAdapter<T> {
        void n(Object obj, Rect rect);
    }

    public interface CollectionAdapter<T, V> {
        Object n(Object obj, int i2);

        int rl(Object obj);
    }

    private static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f37350O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Rect f37351n = new Rect();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Rect f37352t = new Rect();

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f37351n;
            Rect rect2 = this.f37352t;
            this.J2.n(obj, rect);
            this.J2.n(obj2, rect2);
            int i2 = rect.top;
            int i3 = rect2.top;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            int i5 = rect.left;
            int i7 = rect2.left;
            if (i5 < i7) {
                return this.f37350O ? 1 : -1;
            }
            if (i5 > i7) {
                return this.f37350O ? -1 : 1;
            }
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 < i11) {
                return this.f37350O ? 1 : -1;
            }
            if (i10 > i11) {
                return this.f37350O ? -1 : 1;
            }
            return 0;
        }

        SequentialComparator(boolean z2, BoundsAdapter boundsAdapter) {
            this.f37350O = z2;
            this.J2 = boundsAdapter;
        }
    }

    private static int Uo(int i2, int i3) {
        return (i2 * 13 * i2) + (i3 * i3);
    }

    private static int az(int i2, Rect rect, Rect rect2) {
        return Math.max(1, ty(i2, rect, rect2));
    }

    private static int gh(int i2, Rect rect, Rect rect2) {
        return Math.max(0, qie(i2, rect, rect2));
    }

    private static int HI(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    private static boolean mUb(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            return rect.left >= rect2.right;
        }
        if (i2 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i2 == 66) {
            return rect.right <= rect2.left;
        }
        if (i2 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int qie(int i2, Rect rect, Rect rect2) {
        int i3;
        int i5;
        if (i2 == 17) {
            i3 = rect.left;
            i5 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i5 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i5 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i5 = rect.bottom;
        }
        return i3 - i5;
    }

    private static boolean rl(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static Object t(Object obj, CollectionAdapter collectionAdapter, BoundsAdapter boundsAdapter, Object obj2, Rect rect, int i2) {
        Rect rect2 = new Rect(rect);
        if (i2 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i2 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i2 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iRl = collectionAdapter.rl(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i3 = 0; i3 < iRl; i3++) {
            Object objN = collectionAdapter.n(obj, i3);
            if (objN != obj2) {
                boundsAdapter.n(objN, rect3);
                if (KN(i2, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = objN;
                }
            }
        }
        return obj3;
    }

    private static int ty(int i2, Rect rect, Rect rect2) {
        int i3;
        int i5;
        if (i2 == 17) {
            i3 = rect.left;
            i5 = rect2.left;
        } else if (i2 == 33) {
            i3 = rect.top;
            i5 = rect2.top;
        } else if (i2 == 66) {
            i3 = rect2.right;
            i5 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.bottom;
            i5 = rect.bottom;
        }
        return i3 - i5;
    }

    private static boolean xMQ(Rect rect, Rect rect2, int i2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i5 = rect2.right;
            return (i3 > i5 || rect.left >= i5) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            return (i7 > i8 || rect.top >= i8) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            return (i9 < i10 || rect.right <= i10) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        return (i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom;
    }

    private static Object J2(Object obj, ArrayList arrayList, boolean z2) {
        int iIndexOf;
        int size = arrayList.size();
        if (obj == null) {
            iIndexOf = size;
        } else {
            iIndexOf = arrayList.indexOf(obj);
        }
        int i2 = iIndexOf - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (z2 && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    private static boolean KN(int i2, Rect rect, Rect rect2, Rect rect3) {
        if (!xMQ(rect, rect2, i2)) {
            return false;
        }
        if (!xMQ(rect, rect3, i2) || n(i2, rect, rect2, rect3)) {
            return true;
        }
        if (n(i2, rect, rect3, rect2) || Uo(gh(i2, rect, rect2), HI(i2, rect, rect2)) >= Uo(gh(i2, rect, rect3), HI(i2, rect, rect3))) {
            return false;
        }
        return true;
    }

    private static Object O(Object obj, ArrayList arrayList, boolean z2) {
        int iLastIndexOf;
        int size = arrayList.size();
        if (obj == null) {
            iLastIndexOf = -1;
        } else {
            iLastIndexOf = arrayList.lastIndexOf(obj);
        }
        int i2 = iLastIndexOf + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (z2 && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    private static boolean n(int i2, Rect rect, Rect rect2, Rect rect3) {
        boolean zRl = rl(i2, rect, rect2);
        if (rl(i2, rect, rect3) || !zRl) {
            return false;
        }
        if (mUb(i2, rect, rect3) && i2 != 17 && i2 != 66 && gh(i2, rect, rect2) >= az(i2, rect, rect3)) {
            return false;
        }
        return true;
    }

    public static Object nr(Object obj, CollectionAdapter collectionAdapter, BoundsAdapter boundsAdapter, Object obj2, int i2, boolean z2, boolean z3) {
        int iRl = collectionAdapter.rl(obj);
        ArrayList arrayList = new ArrayList(iRl);
        for (int i3 = 0; i3 < iRl; i3++) {
            arrayList.add(collectionAdapter.n(obj, i3));
        }
        Collections.sort(arrayList, new SequentialComparator(z2, boundsAdapter));
        if (i2 != 1) {
            if (i2 == 2) {
                return O(obj2, arrayList, z3);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return J2(obj2, arrayList, z3);
    }
}
