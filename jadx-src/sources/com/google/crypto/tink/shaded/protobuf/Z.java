package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.SPz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Z f59941n;
    private static final Z rl;

    private static final class n extends Z {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Class f59942t = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private n() {
            super();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Z
        List O(Object obj, long j2) {
            return Uo(obj, j2, 10);
        }

        static List J2(Object obj, long j2) {
            return (List) o7q.iF(obj, j2);
        }

        private static List Uo(Object obj, long j2, int i2) {
            List arrayList;
            List listJ2 = J2(obj, j2);
            if (listJ2.isEmpty()) {
                if (listJ2 instanceof afx) {
                    arrayList = new g9s(i2);
                } else if ((listJ2 instanceof InterfaceC1903m) && (listJ2 instanceof SPz.Ml)) {
                    arrayList = ((SPz.Ml) listJ2).mutableCopyWithCapacity(i2);
                } else {
                    arrayList = new ArrayList(i2);
                }
                o7q.U(obj, j2, arrayList);
                return arrayList;
            }
            if (f59942t.isAssignableFrom(listJ2.getClass())) {
                ArrayList arrayList2 = new ArrayList(listJ2.size() + i2);
                arrayList2.addAll(listJ2);
                o7q.U(obj, j2, arrayList2);
                return arrayList2;
            }
            if (listJ2 instanceof Mf) {
                g9s g9sVar = new g9s(listJ2.size() + i2);
                g9sVar.addAll((Mf) listJ2);
                o7q.U(obj, j2, g9sVar);
                return g9sVar;
            }
            if ((listJ2 instanceof InterfaceC1903m) && (listJ2 instanceof SPz.Ml)) {
                SPz.Ml ml = (SPz.Ml) listJ2;
                if (!ml.isModifiable()) {
                    SPz.Ml mlMutableCopyWithCapacity = ml.mutableCopyWithCapacity(listJ2.size() + i2);
                    o7q.U(obj, j2, mlMutableCopyWithCapacity);
                    return mlMutableCopyWithCapacity;
                }
            }
            return listJ2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Z
        void nr(Object obj, Object obj2, long j2) {
            List listJ2 = J2(obj2, j2);
            List listUo = Uo(obj, j2, listJ2.size());
            int size = listUo.size();
            int size2 = listJ2.size();
            if (size > 0 && size2 > 0) {
                listUo.addAll(listJ2);
            }
            if (size > 0) {
                listJ2 = listUo;
            }
            o7q.U(obj, j2, listJ2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Z
        void t(Object obj, long j2) {
            Object objUnmodifiableList;
            List list = (List) o7q.iF(obj, j2);
            if (list instanceof afx) {
                objUnmodifiableList = ((afx) list).getUnmodifiableView();
            } else if (!f59942t.isAssignableFrom(list.getClass())) {
                if ((list instanceof InterfaceC1903m) && (list instanceof SPz.Ml)) {
                    SPz.Ml ml = (SPz.Ml) list;
                    if (ml.isModifiable()) {
                        ml.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            } else {
                return;
            }
            o7q.U(obj, j2, objUnmodifiableList);
        }
    }

    abstract List O(Object obj, long j2);

    abstract void nr(Object obj, Object obj2, long j2);

    abstract void t(Object obj, long j2);

    private static final class w6 extends Z {
        private w6() {
            super();
        }

        static SPz.Ml J2(Object obj, long j2) {
            return (SPz.Ml) o7q.iF(obj, j2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Z
        List O(Object obj, long j2) {
            int i2;
            SPz.Ml mlJ2 = J2(obj, j2);
            if (!mlJ2.isModifiable()) {
                int size = mlJ2.size();
                if (size == 0) {
                    i2 = 10;
                } else {
                    i2 = size * 2;
                }
                SPz.Ml mlMutableCopyWithCapacity = mlJ2.mutableCopyWithCapacity(i2);
                o7q.U(obj, j2, mlMutableCopyWithCapacity);
                return mlMutableCopyWithCapacity;
            }
            return mlJ2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Z
        void nr(Object obj, Object obj2, long j2) {
            SPz.Ml mlJ2 = J2(obj, j2);
            SPz.Ml mlJ22 = J2(obj2, j2);
            int size = mlJ2.size();
            int size2 = mlJ22.size();
            if (size > 0 && size2 > 0) {
                if (!mlJ2.isModifiable()) {
                    mlJ2 = mlJ2.mutableCopyWithCapacity(size2 + size);
                }
                mlJ2.addAll(mlJ22);
            }
            if (size > 0) {
                mlJ22 = mlJ2;
            }
            o7q.U(obj, j2, mlJ22);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Z
        void t(Object obj, long j2) {
            J2(obj, j2).makeImmutable();
        }
    }

    static {
        f59941n = new n();
        rl = new w6();
    }

    private Z() {
    }

    static Z n() {
        return f59941n;
    }

    static Z rl() {
        return rl;
    }
}
