package com.caoccao.javet.interfaces;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IEnumBitset {
    static <E extends Enum<E> & IEnumBitset> EnumSet<E> getEnumSet(int i2, Class<E> cls) {
        return getEnumSet(i2, cls, null);
    }

    static <E extends Enum<E> & IEnumBitset> int getValue(EnumSet<E> enumSet) {
        Objects.requireNonNull(enumSet);
        Iterator<E> it = enumSet.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((IEnumBitset) ((Enum) it.next())).getValue();
        }
        return value;
    }

    int getValue();

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Enum<TE;>;:Lcom/caoccao/javet/interfaces/IEnumBitset;>(ILjava/lang/Class<TE;>;TE;)Ljava/util/EnumSet<TE;>; */
    static EnumSet getEnumSet(int i2, Class cls, Enum r52) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(cls);
        for (Object obj : EnumSet.allOf(cls)) {
            if ((((IEnumBitset) obj).getValue() & i2) > 0) {
                enumSetNoneOf.add(obj);
            }
        }
        if (enumSetNoneOf.isEmpty() && r52 != null) {
            enumSetNoneOf.add(r52);
        }
        return enumSetNoneOf;
    }
}
