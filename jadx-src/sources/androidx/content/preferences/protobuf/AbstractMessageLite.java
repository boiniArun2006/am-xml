package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.AbstractMessageLite;
import androidx.content.preferences.protobuf.ByteString;
import androidx.content.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {

        static final class LimitedInputStream extends FilterInputStream {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f37707n;

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f37707n <= 0) {
                    return -1;
                }
                int i2 = super.read();
                if (i2 >= 0) {
                    this.f37707n--;
                }
                return i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) {
                int iSkip = (int) super.skip(Math.min(j2, this.f37707n));
                if (iSkip >= 0) {
                    this.f37707n -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f37707n);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
                int i5 = this.f37707n;
                if (i5 <= 0) {
                    return -1;
                }
                int i7 = super.read(bArr, i2, Math.min(i3, i5));
                if (i7 >= 0) {
                    this.f37707n -= i7;
                }
                return i7;
            }
        }

        protected abstract Builder J2(AbstractMessageLite abstractMessageLite);

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Builder mergeFrom(byte[] bArr) {
            return qie(bArr, 0, bArr.length);
        }

        @Override // 
        public abstract Builder nr();

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public abstract Builder xMQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        private String O(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        protected static UninitializedMessageException az(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        private static void t(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static void rl(Iterable iterable, List list) {
            Internal.n(iterable);
            if (iterable instanceof LazyStringList) {
                List underlyingElements = ((LazyStringList) iterable).getUnderlyingElements();
                LazyStringList lazyStringList = (LazyStringList) list;
                int size = list.size();
                for (Object obj : underlyingElements) {
                    if (obj == null) {
                        String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                        for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                            lazyStringList.remove(size2);
                        }
                        throw new NullPointerException(str);
                    }
                    if (obj instanceof ByteString) {
                        lazyStringList.a((ByteString) obj);
                    } else if (obj instanceof byte[]) {
                        lazyStringList.a(ByteString.qie((byte[]) obj));
                    } else {
                        lazyStringList.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof PrimitiveNonBoxingCollection) {
                list.addAll((Collection) iterable);
            } else {
                t(iterable, list);
            }
        }

        public Builder KN(CodedInputStream codedInputStream) {
            return xMQ(codedInputStream, ExtensionRegistryLite.rl());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
        public Builder Uo(MessageLite messageLite) {
            if (getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                return J2((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public Builder qie(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStreamQie = CodedInputStream.qie(bArr, i2, i3);
                KN(codedInputStreamQie);
                codedInputStreamQie.n(0);
                return this;
            } catch (InvalidProtocolBufferException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException(O("byte array"), e3);
            }
        }
    }

    protected interface InternalOneOfEnum {
    }

    private String O(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    UninitializedMessageException J2() {
        return new UninitializedMessageException(this);
    }

    void KN(int i2) {
        throw new UnsupportedOperationException();
    }

    int t() {
        throw new UnsupportedOperationException();
    }

    protected static void rl(Iterable iterable, List list) {
        Builder.rl(iterable, list);
    }

    int nr(Schema schema) {
        int iT = t();
        if (iT == -1) {
            int serializedSize = schema.getSerializedSize(this);
            KN(serializedSize);
            return serializedSize;
        }
        return iT;
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder codedBuilderWPU = ByteString.WPU(getSerializedSize());
            n(codedBuilderWPU.rl());
            return codedBuilderWPU.n();
        } catch (IOException e2) {
            throw new RuntimeException(O("ByteString"), e2);
        }
    }

    public void xMQ(OutputStream outputStream) {
        CodedOutputStream codedOutputStreamM = CodedOutputStream.m(outputStream, CodedOutputStream.jB(getSerializedSize()));
        n(codedOutputStreamM);
        codedOutputStreamM.z();
    }
}
