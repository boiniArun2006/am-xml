package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class c3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56539a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f56541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3 f56542d;

    @Override // java.util.Iterator
    public final Object next() {
        this.f56540b = true;
        int i2 = this.f56539a + 1;
        this.f56539a = i2;
        if (i2 < this.f56542d.f56553b.size()) {
            return (Map.Entry) this.f56542d.f56553b.get(this.f56539a);
        }
        if (this.f56541c == null) {
            this.f56541c = this.f56542d.f56554c.entrySet().iterator();
        }
        return (Map.Entry) this.f56541c.next();
    }

    public c3(e3 e3Var) {
        this.f56542d = e3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f56539a + 1 >= this.f56542d.f56553b.size()) {
            if (this.f56542d.f56554c.isEmpty()) {
                return false;
            }
            if (this.f56541c == null) {
                this.f56541c = this.f56542d.f56554c.entrySet().iterator();
            }
            if (!this.f56541c.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f56540b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f56540b = false;
        e3 e3Var = this.f56542d;
        int i2 = e3.f56551h;
        e3Var.a();
        if (this.f56539a >= this.f56542d.f56553b.size()) {
            if (this.f56541c == null) {
                this.f56541c = this.f56542d.f56554c.entrySet().iterator();
            }
            this.f56541c.remove();
            return;
        }
        e3 e3Var2 = this.f56542d;
        int i3 = this.f56539a;
        this.f56539a = i3 - 1;
        e3Var2.a();
        Object obj = ((b3) e3Var2.f56553b.remove(i3)).f56535b;
        if (e3Var2.f56554c.isEmpty()) {
            return;
        }
        Iterator it = e3Var2.c().entrySet().iterator();
        e3Var2.f56553b.add(new b3(e3Var2, (Map.Entry) it.next()));
        it.remove();
    }
}
