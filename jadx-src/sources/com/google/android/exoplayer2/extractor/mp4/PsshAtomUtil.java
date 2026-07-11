package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.container.Mp4Box;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class PsshAtomUtil {
    private static final String TAG = "PsshAtomUtil";

    private static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final UUID f57827n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final byte[] f57828t;

        public j(UUID uuid, int i2, byte[] bArr) {
            this.f57827n = uuid;
            this.rl = i2;
            this.f57828t = bArr;
        }
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(Mp4Box.TYPE_pssh);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    @Nullable
    private static j parsePsshAtom(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.limit() < 32) {
            return null;
        }
        parsableByteArray.setPosition(0);
        if (parsableByteArray.readInt() != parsableByteArray.bytesLeft() + 4 || parsableByteArray.readInt() != 1886614376) {
            return null;
        }
        int iT = com.google.android.exoplayer2.extractor.mp4.j.t(parsableByteArray.readInt());
        if (iT > 1) {
            Log.w(TAG, "Unsupported pssh version: " + iT);
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
        if (iT == 1) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedIntToInt() * 16);
        }
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt != parsableByteArray.bytesLeft()) {
            return null;
        }
        byte[] bArr2 = new byte[unsignedIntToInt];
        parsableByteArray.readBytes(bArr2, 0, unsignedIntToInt);
        return new j(uuid, iT, bArr2);
    }

    private PsshAtomUtil() {
    }

    public static boolean isPsshAtom(byte[] bArr) {
        if (parsePsshAtom(bArr) != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        j psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        if (uuid.equals(psshAtom.f57827n)) {
            return psshAtom.f57828t;
        }
        Log.w(TAG, "UUID mismatch. Expected: " + uuid + ", got: " + psshAtom.f57827n + ".");
        return null;
    }

    @Nullable
    public static UUID parseUuid(byte[] bArr) {
        j psshAtom = parsePsshAtom(bArr);
        if (psshAtom != null) {
            return psshAtom.f57827n;
        }
        return null;
    }

    public static int parseVersion(byte[] bArr) {
        j psshAtom = parsePsshAtom(bArr);
        if (psshAtom != null) {
            return psshAtom.rl;
        }
        return -1;
    }
}
