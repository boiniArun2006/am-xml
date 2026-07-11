package androidx.content.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
abstract class BufferAllocator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final BufferAllocator f37736n = new BufferAllocator() { // from class: androidx.datastore.preferences.protobuf.BufferAllocator.1
        @Override // androidx.content.preferences.protobuf.BufferAllocator
        public AllocatedBuffer rl(int i2) {
            return AllocatedBuffer.mUb(new byte[i2]);
        }

        @Override // androidx.content.preferences.protobuf.BufferAllocator
        public AllocatedBuffer n(int i2) {
            return AllocatedBuffer.xMQ(ByteBuffer.allocateDirect(i2));
        }
    };

    public abstract AllocatedBuffer n(int i2);

    public abstract AllocatedBuffer rl(int i2);

    BufferAllocator() {
    }
}
