package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class iwV {
    private static final QJ EMPTY_REGISTRY = QJ.getEmptyRegistry();
    private C delayedBytes;
    private QJ extensionRegistry;
    private volatile C memoizedBytes;
    protected volatile yg value;

    public iwV(QJ qj, C c2) {
        checkArguments(qj, c2);
        this.extensionRegistry = qj;
        this.delayedBytes = c2;
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public int hashCode() {
        return 1;
    }

    private static void checkArguments(QJ qj, C c2) {
        if (qj == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (c2 == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static iwV fromValue(yg ygVar) {
        iwV iwv = new iwV();
        iwv.setValue(ygVar);
        return iwv;
    }

    public boolean containsDefaultInstance() {
        C c2 = this.memoizedBytes;
        C c4 = C.EMPTY;
        if (c2 == c4) {
            return true;
        }
        if (this.value != null) {
            return false;
        }
        C c5 = this.delayedBytes;
        return c5 == null || c5 == c4;
    }

    protected void ensureInitialized(yg ygVar) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = (yg) ygVar.getParserForType().parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = ygVar;
                    this.memoizedBytes = C.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.value = ygVar;
                this.memoizedBytes = C.EMPTY;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwV)) {
            return false;
        }
        iwV iwv = (iwV) obj;
        yg ygVar = this.value;
        yg ygVar2 = iwv.value;
        return (ygVar == null && ygVar2 == null) ? toByteString().equals(iwv.toByteString()) : (ygVar == null || ygVar2 == null) ? ygVar != null ? ygVar.equals(iwv.getValue(ygVar.getDefaultInstanceForType())) : getValue(ygVar2.getDefaultInstanceForType()).equals(ygVar2) : ygVar.equals(ygVar2);
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        C c2 = this.delayedBytes;
        if (c2 != null) {
            return c2.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public void set(iwV iwv) {
        this.delayedBytes = iwv.delayedBytes;
        this.value = iwv.value;
        this.memoizedBytes = iwv.memoizedBytes;
        QJ qj = iwv.extensionRegistry;
        if (qj != null) {
            this.extensionRegistry = qj;
        }
    }

    public yg setValue(yg ygVar) {
        yg ygVar2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = ygVar;
        return ygVar2;
    }

    public C toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        C c2 = this.delayedBytes;
        if (c2 != null) {
            return c2;
        }
        synchronized (this) {
            try {
                if (this.memoizedBytes != null) {
                    return this.memoizedBytes;
                }
                if (this.value == null) {
                    this.memoizedBytes = C.EMPTY;
                } else {
                    this.memoizedBytes = this.value.toByteString();
                }
                return this.memoizedBytes;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void writeTo(crp crpVar, int i2) throws IOException {
        if (this.memoizedBytes != null) {
            crpVar.writeBytes(i2, this.memoizedBytes);
            return;
        }
        C c2 = this.delayedBytes;
        if (c2 != null) {
            crpVar.writeBytes(i2, c2);
        } else if (this.value != null) {
            crpVar.writeMessage(i2, this.value);
        } else {
            crpVar.writeBytes(i2, C.EMPTY);
        }
    }

    private static yg mergeValueAndBytes(yg ygVar, C c2, QJ qj) {
        try {
            return ygVar.toBuilder().mergeFrom(c2, qj).build();
        } catch (InvalidProtocolBufferException unused) {
            return ygVar;
        }
    }

    public yg getValue(yg ygVar) {
        ensureInitialized(ygVar);
        return this.value;
    }

    public void merge(iwV iwv) {
        C c2;
        if (iwv.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(iwv);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = iwv.extensionRegistry;
        }
        C c4 = this.delayedBytes;
        if (c4 != null && (c2 = iwv.delayedBytes) != null) {
            this.delayedBytes = c4.concat(c2);
            return;
        }
        if (this.value == null && iwv.value != null) {
            setValue(mergeValueAndBytes(iwv.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value != null && iwv.value == null) {
            setValue(mergeValueAndBytes(this.value, iwv.delayedBytes, iwv.extensionRegistry));
        } else {
            setValue(this.value.toBuilder().mergeFrom(iwv.value).build());
        }
    }

    public void mergeFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(abstractC1923o.readBytes(), qj);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = qj;
        }
        C c2 = this.delayedBytes;
        if (c2 != null) {
            setByteString(c2.concat(abstractC1923o.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(abstractC1923o, qj).build());
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public void setByteString(C c2, QJ qj) {
        checkArguments(qj, c2);
        this.delayedBytes = c2;
        this.extensionRegistry = qj;
        this.value = null;
        this.memoizedBytes = null;
    }

    public iwV() {
    }
}
