package com.fyber.inneractive.sdk.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class r1 extends t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f56648c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) x3.e(obj, j2);
        if (list instanceof q1) {
            objUnmodifiableList = ((q1) list).a();
        } else {
            if (f56648c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof n2) && (list instanceof k1)) {
                c cVar = (c) ((k1) list);
                if (cVar.f56537a) {
                    cVar.f56537a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        x3.a(j2, obj, objUnmodifiableList);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final List b(Object obj, long j2) {
        return a(obj, j2, 10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(long j2, Object obj, Object obj2) {
        List list = (List) x3.e(obj2, j2);
        List listA = a(obj, j2, list.size());
        int size = listA.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listA.addAll(list);
        }
        if (size > 0) {
            list = listA;
        }
        x3.a(j2, obj, list);
    }

    public static List a(Object obj, long j2, int i2) {
        List arrayList;
        List list = (List) x3.e(obj, j2);
        if (list.isEmpty()) {
            if (list instanceof q1) {
                arrayList = new p1(i2);
            } else if ((list instanceof n2) && (list instanceof k1)) {
                arrayList = ((k1) list).b(i2);
            } else {
                arrayList = new ArrayList(i2);
            }
            x3.a(j2, obj, arrayList);
            return arrayList;
        }
        if (f56648c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i2);
            arrayList2.addAll(list);
            x3.a(j2, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof r3) {
            p1 p1Var = new p1(list.size() + i2);
            p1Var.addAll((r3) list);
            x3.a(j2, obj, p1Var);
            return p1Var;
        }
        if ((list instanceof n2) && (list instanceof k1)) {
            k1 k1Var = (k1) list;
            if (!((c) k1Var).f56537a) {
                k1 k1VarB = k1Var.b(list.size() + i2);
                x3.a(j2, obj, k1VarB);
                return k1VarB;
            }
        }
        return list;
    }
}
