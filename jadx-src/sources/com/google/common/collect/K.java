package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class K {

    private static class j extends w6 {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        transient t1.UGc f59603Z;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Ml
        /* JADX INFO: renamed from: E2, reason: merged with bridge method [inline-methods] */
        public List XQ() {
            return (List) this.f59603Z.get();
        }

        j(Map map, t1.UGc uGc) {
            super(map);
            this.f59603Z = (t1.UGc) t1.Xo.HI(uGc);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f59603Z = (t1.UGc) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            g((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f59603Z);
            objectOutputStream.writeObject(Z());
        }

        @Override // com.google.common.collect.Ml, com.google.common.collect.Wre
        Map O() {
            return WPU();
        }

        @Override // com.google.common.collect.Ml, com.google.common.collect.Wre
        Set Uo() {
            return aYN();
        }
    }

    static abstract class n extends AbstractCollection {
        abstract Lu rl();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return rl().t(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return rl().remove(entry.getKey(), entry.getValue());
        }

        n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            rl().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return rl().size();
        }
    }

    static boolean n(Lu lu, Object obj) {
        if (obj == lu) {
            return true;
        }
        if (obj instanceof Lu) {
            return lu.rl().equals(((Lu) obj).rl());
        }
        return false;
    }

    public static M rl(Map map, t1.UGc uGc) {
        return new j(map, uGc);
    }
}
