package com.google.protobuf;

import com.google.protobuf.C;
import com.google.protobuf.yg;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j implements yg {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.protobuf.j$j, reason: collision with other inner class name */
    public static abstract class AbstractC0822j implements yg.j {

        /* JADX INFO: renamed from: com.google.protobuf.j$j$j, reason: collision with other inner class name */
        static final class C0823j extends FilterInputStream {
            private int limit;

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int i2 = super.read();
                if (i2 >= 0) {
                    this.limit--;
                }
                return i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) throws IOException {
                int iSkip = (int) super.skip(Math.min(j2, this.limit));
                if (iSkip >= 0) {
                    this.limit -= iSkip;
                }
                return iSkip;
            }

            C0823j(InputStream inputStream, int i2) {
                super(inputStream);
                this.limit = i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
                int i5 = this.limit;
                if (i5 <= 0) {
                    return -1;
                }
                int i7 = super.read(bArr, i2, Math.min(i3, i5));
                if (i7 >= 0) {
                    this.limit -= i7;
                }
                return i7;
            }
        }

        @Deprecated
        protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        @Override // com.google.protobuf.yg.j
        public abstract /* synthetic */ yg build();

        @Override // com.google.protobuf.yg.j
        public abstract /* synthetic */ yg buildPartial();

        @Override // com.google.protobuf.yg.j
        public abstract /* synthetic */ yg.j clear();

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract AbstractC0822j mo187clone();

        @Override // com.google.protobuf.yg.j, com.google.protobuf.pO
        public abstract /* synthetic */ yg getDefaultInstanceForType();

        protected abstract AbstractC0822j internalMergeFrom(j jVar);

        @Override // com.google.protobuf.yg.j, com.google.protobuf.pO
        public abstract /* synthetic */ boolean isInitialized();

        @Override // com.google.protobuf.yg.j
        public boolean mergeDelimitedFrom(InputStream inputStream, QJ qj) throws IOException {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return false;
            }
            mergeFrom((InputStream) new C0823j(inputStream, AbstractC1923o.readRawVarint32(i2, inputStream)), qj);
            return true;
        }

        @Override // com.google.protobuf.yg.j
        public abstract AbstractC0822j mergeFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException;

        protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            nKK.checkNotNull(iterable);
            if (!(iterable instanceof rv6)) {
                if (iterable instanceof Mf) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    addAllCheckingNulls(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((rv6) iterable).getUnderlyingElements();
            rv6 rv6Var = (rv6) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (rv6Var.size() - size) + " is null.";
                    for (int size2 = rv6Var.size() - 1; size2 >= size; size2--) {
                        rv6Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C) {
                    rv6Var.add((C) obj);
                } else {
                    rv6Var.add((String) obj);
                }
            }
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t3 : iterable) {
                if (t3 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t3);
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static UninitializedMessageException newUninitializedMessageException(yg ygVar) {
            return new UninitializedMessageException(ygVar);
        }

        @Override // com.google.protobuf.yg.j
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, QJ.getEmptyRegistry());
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(AbstractC1923o abstractC1923o) throws IOException {
            return mergeFrom(abstractC1923o, QJ.getEmptyRegistry());
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(C c2) throws InvalidProtocolBufferException {
            try {
                AbstractC1923o abstractC1923oNewCodedInput = c2.newCodedInput();
                mergeFrom(abstractC1923oNewCodedInput);
                abstractC1923oNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e3);
            }
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
            try {
                AbstractC1923o abstractC1923oNewCodedInput = c2.newCodedInput();
                mergeFrom(abstractC1923oNewCodedInput, qj);
                abstractC1923oNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e3);
            }
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            try {
                AbstractC1923o abstractC1923oNewInstance = AbstractC1923o.newInstance(bArr, i2, i3);
                mergeFrom(abstractC1923oNewInstance);
                abstractC1923oNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e3);
            }
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length, qj);
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(byte[] bArr, int i2, int i3, QJ qj) throws InvalidProtocolBufferException {
            try {
                AbstractC1923o abstractC1923oNewInstance = AbstractC1923o.newInstance(bArr, i2, i3);
                mergeFrom(abstractC1923oNewInstance, qj);
                abstractC1923oNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e3);
            }
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(InputStream inputStream) throws IOException {
            AbstractC1923o abstractC1923oNewInstance = AbstractC1923o.newInstance(inputStream);
            mergeFrom(abstractC1923oNewInstance);
            abstractC1923oNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(InputStream inputStream, QJ qj) throws IOException {
            AbstractC1923o abstractC1923oNewInstance = AbstractC1923o.newInstance(inputStream);
            mergeFrom(abstractC1923oNewInstance, qj);
            abstractC1923oNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.yg.j
        public AbstractC0822j mergeFrom(yg ygVar) {
            if (getDefaultInstanceForType().getClass().isInstance(ygVar)) {
                return internalMergeFrom((j) ygVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Deprecated
    protected static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0822j.addAll((Iterable) iterable, (List) collection);
    }

    @Override // com.google.protobuf.yg, com.google.protobuf.pO
    public abstract /* synthetic */ yg getDefaultInstanceForType();

    @Override // com.google.protobuf.yg
    public abstract /* synthetic */ KH getParserForType();

    @Override // com.google.protobuf.yg
    public abstract /* synthetic */ int getSerializedSize();

    int getSerializedSize(R6 r6) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = r6.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    @Override // com.google.protobuf.yg, com.google.protobuf.pO
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.yg
    public abstract /* synthetic */ yg.j newBuilderForType();

    @Override // com.google.protobuf.yg
    public abstract /* synthetic */ yg.j toBuilder();

    @Override // com.google.protobuf.yg
    public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    @Override // com.google.protobuf.yg
    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(getSerializedSize()));
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    protected static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0822j.addAll((Iterable) iterable, (List) list);
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    void setMemoizedSerializedSize(int i2) {
        throw new UnsupportedOperationException();
    }

    protected static void checkByteStringIsUtf8(C c2) throws IllegalArgumentException {
        if (c2.isValidUtf8()) {
        } else {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @Override // com.google.protobuf.yg
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr);
            writeTo(codedOutputStreamNewInstance);
            codedOutputStreamNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e2);
        }
    }

    @Override // com.google.protobuf.yg
    public C toByteString() {
        try {
            C.fuX fuxNewCodedBuilder = C.newCodedBuilder(getSerializedSize());
            writeTo(fuxNewCodedBuilder.getCodedOutput());
            return fuxNewCodedBuilder.build();
        } catch (IOException e2) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e2);
        }
    }

    @Override // com.google.protobuf.yg
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        codedOutputStreamNewInstance.writeUInt32NoTag(serializedSize);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }
}
