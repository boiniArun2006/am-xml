package com.google.common.collect;

import com.google.common.collect.psW;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class AbstractC1899p {

    /* JADX INFO: renamed from: com.google.common.collect.p$n */
    static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Field f59761n;

        private n(Field field) {
            this.f59761n = field;
            field.setAccessible(true);
        }

        void n(Object obj, int i2) {
            try {
                this.f59761n.set(obj, Integer.valueOf(i2));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        void rl(Object obj, Object obj2) {
            try {
                this.f59761n.set(obj, obj2);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    static void nr(psW psw, ObjectInputStream objectInputStream, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            psw.M(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static void rl(Lu lu, ObjectInputStream objectInputStream, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            Collection collection = lu.get(objectInputStream.readObject());
            int i5 = objectInputStream.readInt();
            for (int i7 = 0; i7 < i5; i7++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    static void J2(Lu lu, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(lu.rl().size());
        for (Map.Entry entry : lu.rl().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    static int O(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    static void Uo(psW psw, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(psw.entrySet().size());
        for (psW.j jVar : psw.entrySet()) {
            objectOutputStream.writeObject(jVar.getElement());
            objectOutputStream.writeInt(jVar.getCount());
        }
    }

    static n n(Class cls, String str) {
        try {
            return new n(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    static void t(psW psw, ObjectInputStream objectInputStream) {
        nr(psw, objectInputStream, objectInputStream.readInt());
    }
}
