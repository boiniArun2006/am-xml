package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f56704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f56705c;

    public w2(e3 e3Var) {
        this.f56705c = e3Var;
        this.f56703a = e3Var.f56553b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f56703a;
        if (i2 > 0 && i2 <= this.f56705c.f56553b.size()) {
            return true;
        }
        if (this.f56704b == null) {
            this.f56704b = this.f56705c.f56557f.entrySet().iterator();
        }
        return this.f56704b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f56704b == null) {
            this.f56704b = this.f56705c.f56557f.entrySet().iterator();
        }
        if (this.f56704b.hasNext()) {
            if (this.f56704b == null) {
                this.f56704b = this.f56705c.f56557f.entrySet().iterator();
            }
            return (Map.Entry) this.f56704b.next();
        }
        List list = this.f56705c.f56553b;
        int i2 = this.f56703a - 1;
        this.f56703a = i2;
        return (Map.Entry) list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
