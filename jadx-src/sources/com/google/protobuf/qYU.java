package com.google.protobuf;

import com.google.android.gms.ads.identifier.Ov.YmsTEL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class qYU {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class j implements w6 {
        final /* synthetic */ C val$input;

        j(C c2) {
            this.val$input = c2;
        }

        @Override // com.google.protobuf.qYU.w6
        public byte byteAt(int i2) {
            return this.val$input.byteAt(i2);
        }

        @Override // com.google.protobuf.qYU.w6
        public int size() {
            return this.val$input.size();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class n implements w6 {
        final /* synthetic */ byte[] val$input;

        n(byte[] bArr) {
            this.val$input = bArr;
        }

        @Override // com.google.protobuf.qYU.w6
        public byte byteAt(int i2) {
            return this.val$input[i2];
        }

        @Override // com.google.protobuf.qYU.w6
        public int size() {
            return this.val$input.length;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private interface w6 {
        byte byteAt(int i2);

        int size();
    }

    static String escapeBytes(w6 w6Var) {
        StringBuilder sb = new StringBuilder(w6Var.size());
        for (int i2 = 0; i2 < w6Var.size(); i2++) {
            byte bByteAt = w6Var.byteAt(i2);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", YmsTEL.DYidwTmd).replace("\"", "\\\"");
    }

    private qYU() {
    }

    static String escapeText(String str) {
        return escapeBytes(C.copyFromUtf8(str));
    }

    static String escapeBytes(C c2) {
        return escapeBytes(new j(c2));
    }

    static String escapeBytes(byte[] bArr) {
        return escapeBytes(new n(bArr));
    }
}
