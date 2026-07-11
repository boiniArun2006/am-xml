package com.google.protobuf;

import com.google.protobuf.nKK;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class vd {
    private static final vd FULL_INSTANCE;
    private static final vd LITE_INSTANCE;

    private static final class n extends vd {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private n() {
            super();
        }

        @Override // com.google.protobuf.vd
        <L> List<L> mutableListAt(Object obj, long j2) {
            return mutableListAt(obj, j2, 10);
        }

        private static <L> List<L> mutableListAt(Object obj, long j2, int i2) {
            List<L> list = getList(obj, j2);
            if (list.isEmpty()) {
                List<L> m2 = list instanceof rv6 ? new M(i2) : ((list instanceof Mf) && (list instanceof nKK.Dsr)) ? ((nKK.Dsr) list).mutableCopyWithCapacity(i2) : new ArrayList<>(i2);
                g9.putObject(obj, j2, m2);
                return m2;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i2);
                arrayList.addAll(list);
                g9.putObject(obj, j2, arrayList);
                return arrayList;
            }
            if (list instanceof cA) {
                M m3 = new M(list.size() + i2);
                m3.addAll((cA) list);
                g9.putObject(obj, j2, m3);
                return m3;
            }
            if ((list instanceof Mf) && (list instanceof nKK.Dsr)) {
                nKK.Dsr dsr = (nKK.Dsr) list;
                if (!dsr.isModifiable()) {
                    nKK.Dsr dsrMutableCopyWithCapacity = dsr.mutableCopyWithCapacity(list.size() + i2);
                    g9.putObject(obj, j2, dsrMutableCopyWithCapacity);
                    return dsrMutableCopyWithCapacity;
                }
            }
            return list;
        }

        static <E> List<E> getList(Object obj, long j2) {
            return (List) g9.getObject(obj, j2);
        }

        @Override // com.google.protobuf.vd
        void makeImmutableListAt(Object obj, long j2) {
            Object objUnmodifiableList;
            List list = (List) g9.getObject(obj, j2);
            if (list instanceof rv6) {
                objUnmodifiableList = ((rv6) list).getUnmodifiableView();
            } else if (!UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                if ((list instanceof Mf) && (list instanceof nKK.Dsr)) {
                    nKK.Dsr dsr = (nKK.Dsr) list;
                    if (dsr.isModifiable()) {
                        dsr.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            } else {
                return;
            }
            g9.putObject(obj, j2, objUnmodifiableList);
        }

        @Override // com.google.protobuf.vd
        <E> void mergeListsAt(Object obj, Object obj2, long j2) {
            List list = getList(obj2, j2);
            List listMutableListAt = mutableListAt(obj, j2, list.size());
            int size = listMutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(list);
            }
            if (size > 0) {
                list = listMutableListAt;
            }
            g9.putObject(obj, j2, list);
        }
    }

    abstract void makeImmutableListAt(Object obj, long j2);

    abstract <L> void mergeListsAt(Object obj, Object obj2, long j2);

    abstract <L> List<L> mutableListAt(Object obj, long j2);

    private static final class w6 extends vd {
        private w6() {
            super();
        }

        static <E> nKK.Dsr getProtobufList(Object obj, long j2) {
            return (nKK.Dsr) g9.getObject(obj, j2);
        }

        @Override // com.google.protobuf.vd
        void makeImmutableListAt(Object obj, long j2) {
            getProtobufList(obj, j2).makeImmutable();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r6v1, types: [com.google.protobuf.nKK$Dsr, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v3 */
        @Override // com.google.protobuf.vd
        <E> void mergeListsAt(Object obj, Object obj2, long j2) {
            nKK.Dsr protobufList = getProtobufList(obj, j2);
            ?? protobufList2 = getProtobufList(obj2, j2);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            ?? r02 = protobufList;
            r02 = protobufList;
            if (size > 0 && size2 > 0) {
                boolean zIsModifiable = protobufList.isModifiable();
                ?? MutableCopyWithCapacity = protobufList;
                if (!zIsModifiable) {
                    MutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size2 + size);
                }
                MutableCopyWithCapacity.addAll(protobufList2);
                r02 = MutableCopyWithCapacity;
            }
            if (size > 0) {
                protobufList2 = r02;
            }
            g9.putObject(obj, j2, (Object) protobufList2);
        }

        @Override // com.google.protobuf.vd
        <L> List<L> mutableListAt(Object obj, long j2) {
            int i2;
            nKK.Dsr protobufList = getProtobufList(obj, j2);
            if (!protobufList.isModifiable()) {
                int size = protobufList.size();
                if (size == 0) {
                    i2 = 10;
                } else {
                    i2 = size * 2;
                }
                nKK.Dsr dsrMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(i2);
                g9.putObject(obj, j2, dsrMutableCopyWithCapacity);
                return dsrMutableCopyWithCapacity;
            }
            return protobufList;
        }
    }

    static {
        FULL_INSTANCE = new n();
        LITE_INSTANCE = new w6();
    }

    private vd() {
    }

    static vd full() {
        return FULL_INSTANCE;
    }

    static vd lite() {
        return LITE_INSTANCE;
    }
}
