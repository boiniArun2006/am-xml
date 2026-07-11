package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class ci extends AbstractList {
    public List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f52349O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f52350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f52351o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f52352r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f52353t;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final n f52348Z = new n(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final AtomicInteger f52347S = new AtomicInteger();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public interface j {
        void n(ci ciVar);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public n() {
        }
    }

    public ci(Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f52349O = String.valueOf(Integer.valueOf(f52347S.incrementAndGet()));
        this.f52352r = new ArrayList();
        this.J2 = new ArrayList(requests);
    }

    private final List Uo() {
        return GraphRequest.ty.xMQ(this);
    }

    private final SPz xMQ() {
        return GraphRequest.ty.qie(this);
    }

    public final List HI() {
        return this.J2;
    }

    public final int Ik() {
        return this.f52353t;
    }

    public final void ViF(Handler handler) {
        this.f52350n = handler;
    }

    public GraphRequest WPU(int i2) {
        return (GraphRequest) this.J2.remove(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int i2, GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (GraphRequest) this.J2.set(i2, element);
    }

    public final List az() {
        return this.f52352r;
    }

    public int ck() {
        return this.J2.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.J2.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return O((GraphRequest) obj);
        }
        return false;
    }

    public final String gh() {
        return this.f52351o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return r((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return o((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int i2) {
        return (GraphRequest) this.J2.get(i2);
    }

    public final void nr(j callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f52352r.contains(callback)) {
            return;
        }
        this.f52352r.add(callback);
    }

    public final Handler qie() {
        return this.f52350n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return S((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void add(int i2, GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.J2.add(i2, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean add(GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.J2.add(element);
    }

    public final String ty() {
        return this.f52349O;
    }

    public final List J2() {
        return Uo();
    }

    public final SPz KN() {
        return xMQ();
    }

    public /* bridge */ boolean O(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    public /* bridge */ boolean S(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i2) {
        return WPU(i2);
    }

    public /* bridge */ int o(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    public /* bridge */ int r(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return ck();
    }

    public ci(GraphRequest... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f52349O = String.valueOf(Integer.valueOf(f52347S.incrementAndGet()));
        this.f52352r = new ArrayList();
        this.J2 = new ArrayList(ArraysKt.asList(requests));
    }
}
