package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(@NonNull DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @NonNull
    public final Object next() {
        if (hasNext()) {
            int i2 = this.zab + 1;
            this.zab = i2;
            if (i2 == 0) {
                Object objCheckNotNull = Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = objCheckNotNull;
                if (!(objCheckNotNull instanceof DataBufferRef)) {
                    throw new IllegalStateException("DataBuffer reference of type " + String.valueOf(objCheckNotNull.getClass()) + " is not movable");
                }
            } else {
                ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            }
            return this.zac;
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
    }
}
