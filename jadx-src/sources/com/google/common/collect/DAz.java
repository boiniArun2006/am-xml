package com.google.common.collect;

import com.google.common.collect.nKK;
import com.google.common.collect.qf;
import com.google.common.collect.u;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class DAz extends qf implements M {
    public static DAz WPU() {
        return UGc.f59666Z;
    }

    @Override // com.google.common.collect.Lu
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public nKK get(Object obj) {
        nKK nkk = (nKK) this.f59765r.get(obj);
        return nkk == null ? nKK.r() : nkk;
    }

    DAz(u uVar, int i2) {
        super(uVar, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 >= 0) {
            u.j jVarT = u.t();
            int i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                Object object = objectInputStream.readObject();
                Objects.requireNonNull(object);
                int i7 = objectInputStream.readInt();
                if (i7 > 0) {
                    nKK.j jVarGh = nKK.gh();
                    for (int i8 = 0; i8 < i7; i8++) {
                        Object object2 = objectInputStream.readObject();
                        Objects.requireNonNull(object2);
                        jVarGh.n(object2);
                    }
                    jVarT.J2(object, jVarGh.gh());
                    i3 += i7;
                } else {
                    throw new InvalidObjectException("Invalid value count " + i7);
                }
            }
            try {
                qf.Ml.f59767n.rl(this, jVarT.t());
                qf.Ml.rl.n(this, i3);
                return;
            } catch (IllegalArgumentException e2) {
                throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
            }
        }
        throw new InvalidObjectException("Invalid key count " + i2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        AbstractC1899p.J2(this, objectOutputStream);
    }
}
