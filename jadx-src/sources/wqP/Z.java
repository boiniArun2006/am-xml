package wqP;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestoreException;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Random f75124n = new SecureRandom();
    private static final Continuation rl = new Continuation() { // from class: wqP.r
        @Override // com.google.android.gms.tasks.Continuation
        public final Object then(Task task) {
            return Z.nr(task);
        }
    };

    public static int KN(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = bArr[i2] & UByte.MAX_VALUE;
            int i5 = bArr2[i2] & UByte.MAX_VALUE;
            if (i3 < i5) {
                return -1;
            }
            if (i3 > i5) {
                return 1;
            }
        }
        return gh(bArr.length, bArr2.length);
    }

    public static /* synthetic */ void t(RuntimeException runtimeException) {
        throw runtimeException;
    }

    public static int ty(String str, String str2) {
        int iCharCount = 0;
        while (iCharCount < str.length() && iCharCount < str2.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt != iCodePointAt2) {
                if (iCodePointAt < 128 && iCodePointAt2 < 128) {
                    return Integer.compare(iCodePointAt, iCodePointAt2);
                }
                int iXMQ = xMQ(com.google.protobuf.C.copyFromUtf8(XQ(str, iCharCount)), com.google.protobuf.C.copyFromUtf8(XQ(str2, iCharCount)));
                return iXMQ != 0 ? iXMQ : Integer.compare(iCodePointAt, iCodePointAt2);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return Integer.compare(str.length(), str2.length());
    }

    private static Exception HI(Exception exc) {
        return exc instanceof StatusException ? o(((StatusException) exc).n()) : exc instanceof StatusRuntimeException ? o(((StatusRuntimeException) exc).n()) : exc;
    }

    public static Comparator J2() {
        return new Comparator() { // from class: wqP.ci
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        };
    }

    public static StringBuilder S(CharSequence charSequence, int i2, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i2 != 0) {
            sb.append(charSequence);
            for (int i3 = 1; i3 < i2; i3++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static int Uo(boolean z2, boolean z3) {
        if (z2 == z3) {
            return 0;
        }
        return z2 ? 1 : -1;
    }

    public static void ck(final RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: wqP.SPz
            @Override // java.lang.Runnable
            public final void run() {
                Z.t(runtimeException);
            }
        });
    }

    public static int gh(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Ik(Iterator it, Iterator it2, Comparator comparator, C c2, C c4) {
        Object objO = O(it);
        Object objO2 = O(it2);
        while (true) {
            if (objO == null && objO2 == null) {
                return;
            }
            boolean z2 = false;
            boolean z3 = true;
            if (objO != null && objO2 != null) {
                int iCompare = comparator.compare(objO, objO2);
                if (iCompare >= 0) {
                    if (iCompare <= 0) {
                        z3 = false;
                    }
                }
            } else if (objO == null) {
                z3 = false;
                z2 = true;
            }
            if (z2) {
                c2.accept(objO2);
                objO2 = O(it2);
            } else if (z3) {
                c4.accept(objO);
                objO = O(it);
            } else {
                objO = O(it);
                objO2 = O(it2);
            }
        }
    }

    private static Object O(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String WPU(com.google.protobuf.C c2) {
        int size = c2.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i2 = 0; i2 < size; i2++) {
            byte bByteAt = c2.byteAt(i2);
            sb.append(Character.forDigit((bByteAt & UByte.MAX_VALUE) >>> 4, 16));
            sb.append(Character.forDigit(bByteAt & 15, 16));
        }
        return sb.toString();
    }

    private static String XQ(String str, int i2) {
        return str.substring(i2, Character.charCount(str.codePointAt(i2)) + i2);
    }

    public static Map Z(Map map, int i2, final Comparator comparator) {
        if (map.size() <= i2) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: wqP.afx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
            }
        });
        HashMap map2 = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            map2.put(((Map.Entry) arrayList.get(i3)).getKey(), ((Map.Entry) arrayList.get(i3)).getValue());
        }
        return map2;
    }

    public static int az(double d2, long j2) {
        return fJx.j.rl(d2, j2);
    }

    public static int mUb(double d2, double d4) {
        return fJx.j.t(d2, d4);
    }

    public static /* synthetic */ Void nr(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception excHI = HI(task.getException());
        if (excHI instanceof FirebaseFirestoreException) {
            throw excHI;
        }
        throw new FirebaseFirestoreException(excHI.getMessage(), FirebaseFirestoreException.j.UNKNOWN, excHI);
    }

    public static FirebaseFirestoreException o(io.grpc.SPz sPz) {
        StatusException statusExceptionT = sPz.t();
        return new FirebaseFirestoreException(statusExceptionT.getMessage(), FirebaseFirestoreException.j.t(sPz.az().t()), statusExceptionT);
    }

    public static int qie(long j2, long j3) {
        return fJx.j.n(j2, j3);
    }

    public static void r(SortedSet sortedSet, SortedSet sortedSet2, C c2, C c4) {
        Comparator comparator;
        Iterator it = sortedSet.iterator();
        Iterator it2 = sortedSet2.iterator();
        if (sortedSet.comparator() != null) {
            comparator = sortedSet.comparator();
        } else {
            comparator = new Comparator() { // from class: wqP.g9s
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Comparable) obj).compareTo((Comparable) obj2);
                }
            };
        }
        Ik(it, it2, comparator, c2, c4);
    }

    public static int xMQ(com.google.protobuf.C c2, com.google.protobuf.C c4) {
        int iMin = Math.min(c2.size(), c4.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            int iByteAt = c2.byteAt(i2) & UByte.MAX_VALUE;
            int iByteAt2 = c4.byteAt(i2) & UByte.MAX_VALUE;
            if (iByteAt < iByteAt2) {
                return -1;
            }
            if (iByteAt > iByteAt2) {
                return 1;
            }
        }
        return gh(c2.size(), c4.size());
    }
}
