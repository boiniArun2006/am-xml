package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.ArrayDecoders;
import androidx.content.preferences.protobuf.ByteString;
import androidx.content.preferences.protobuf.Internal;
import androidx.content.preferences.protobuf.InvalidProtocolBufferException;
import androidx.content.preferences.protobuf.MapEntryLite;
import androidx.content.preferences.protobuf.WireFormat;
import androidx.content.preferences.protobuf.Writer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
    private final UnknownFieldSchema HI;
    private final MapFieldSchema Ik;
    private final boolean J2;
    private final ProtoSyntax KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MessageLite f38092O;
    private final boolean Uo;
    private final NewInstanceSchema az;
    private final ExtensionSchema ck;
    private final int gh;
    private final int[] mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f38093n;
    private final int nr;
    private final int qie;
    private final Object[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f38094t;
    private final ListFieldSchema ty;
    private final boolean xMQ;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f38091r = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Unsafe f38090o = UnsafeUtil.N();

    private int E(Object obj, byte[] bArr, int i2, int i3, int i5, long j2, ArrayDecoders.Registers registers) {
        Unsafe unsafe = f38090o;
        Object objHI = HI(i5);
        Object object = unsafe.getObject(obj, j2);
        if (this.Ik.isImmutable(object)) {
            Object objNewMapField = this.Ik.newMapField(objHI);
            this.Ik.mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j2, objNewMapField);
            object = objNewMapField;
        }
        return Uo(bArr, i2, i3, this.Ik.forMapMetadata(objHI), this.Ik.forMutableMapData(object), registers);
    }

    private static boolean Z(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static boolean aYN(int i2) {
        return (i2 & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static MessageSchema bzg(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int i2;
        int iCharAt;
        int i3;
        int i5;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        char cCharAt;
        int i12;
        char cCharAt2;
        int i13;
        char cCharAt3;
        int i14;
        char cCharAt4;
        int i15;
        char cCharAt5;
        int i16;
        char cCharAt6;
        int i17;
        char cCharAt7;
        int i18;
        char cCharAt8;
        int i19;
        int i20;
        int i21;
        int i22;
        int iObjectFieldOffset;
        String str;
        int i23;
        int iObjectFieldOffset2;
        int i24;
        int i25;
        int iObjectFieldOffset3;
        int i26;
        Field fieldK;
        char cCharAt9;
        int i27;
        int i28;
        Object obj;
        Field fieldK2;
        Object obj2;
        Field fieldK3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        String strRl = rawMessageInfo.rl();
        int length = strRl.length();
        char c2 = 55296;
        if (strRl.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i2 = i33 + 1;
                if (strRl.charAt(i33) < 55296) {
                    break;
                }
                i33 = i2;
            }
        } else {
            i2 = 1;
        }
        int i34 = i2 + 1;
        int iCharAt2 = strRl.charAt(i2);
        if (iCharAt2 >= 55296) {
            int i35 = iCharAt2 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                cCharAt13 = strRl.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            iCharAt2 = i35 | (cCharAt13 << i36);
            i34 = i32;
        }
        if (iCharAt2 == 0) {
            i7 = 0;
            iCharAt = 0;
            i5 = 0;
            i10 = 0;
            i3 = 0;
            i9 = 0;
            iArr = f38091r;
            i8 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt3 = strRl.charAt(i34);
            if (iCharAt3 >= 55296) {
                int i38 = iCharAt3 & 8191;
                int i39 = 13;
                while (true) {
                    i18 = i37 + 1;
                    cCharAt8 = strRl.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i18;
                }
                iCharAt3 = i38 | (cCharAt8 << i39);
                i37 = i18;
            }
            int i40 = i37 + 1;
            int iCharAt4 = strRl.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i17 = i40 + 1;
                    cCharAt7 = strRl.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i17;
                }
                iCharAt4 = i41 | (cCharAt7 << i42);
                i40 = i17;
            }
            int i43 = i40 + 1;
            int iCharAt5 = strRl.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i16 = i43 + 1;
                    cCharAt6 = strRl.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i16;
                }
                iCharAt5 = i44 | (cCharAt6 << i45);
                i43 = i16;
            }
            int i46 = i43 + 1;
            int iCharAt6 = strRl.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i15 = i46 + 1;
                    cCharAt5 = strRl.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i15;
                }
                iCharAt6 = i47 | (cCharAt5 << i48);
                i46 = i15;
            }
            int i49 = i46 + 1;
            iCharAt = strRl.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i14 = i49 + 1;
                    cCharAt4 = strRl.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i14;
                }
                iCharAt = i50 | (cCharAt4 << i51);
                i49 = i14;
            }
            int i52 = i49 + 1;
            int iCharAt7 = strRl.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i13 = i52 + 1;
                    cCharAt3 = strRl.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i13;
                }
                iCharAt7 = i53 | (cCharAt3 << i54);
                i52 = i13;
            }
            int i55 = i52 + 1;
            int iCharAt8 = strRl.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i12 = i55 + 1;
                    cCharAt2 = strRl.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i12;
                }
                iCharAt8 = i56 | (cCharAt2 << i57);
                i55 = i12;
            }
            int i58 = i55 + 1;
            int iCharAt9 = strRl.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i11 = i58 + 1;
                    cCharAt = strRl.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i11;
                }
                iCharAt9 = i59 | (cCharAt << i60);
                i58 = i11;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i3 = (iCharAt3 * 2) + iCharAt4;
            int i61 = iCharAt7;
            i5 = iCharAt5;
            i7 = i61;
            i8 = iCharAt3;
            iArr = iArr2;
            i9 = iCharAt9;
            i34 = i58;
            i10 = iCharAt6;
        }
        Unsafe unsafe = f38090o;
        Object[] objArrN = rawMessageInfo.n();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i62 = i9 + i7;
        int i63 = i62;
        int i64 = i9;
        int i65 = 0;
        int i66 = 0;
        while (i34 < length) {
            int i67 = i34 + 1;
            int iCharAt10 = strRl.charAt(i34);
            if (iCharAt10 >= c2) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i31 = i69 + 1;
                    cCharAt12 = strRl.charAt(i69);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i31;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i19 = i31;
            } else {
                i19 = i67;
            }
            int i71 = i19 + 1;
            int iCharAt11 = strRl.charAt(i19);
            if (iCharAt11 >= c2) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i30 = i73 + 1;
                    cCharAt11 = strRl.charAt(i73);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i30;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i20 = i30;
            } else {
                i20 = i71;
            }
            int i75 = iCharAt11 & 255;
            int i76 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int[] iArr4 = iArr3;
            if (i75 >= 51) {
                int i77 = i20 + 1;
                int iCharAt12 = strRl.charAt(i20);
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = 13;
                    while (true) {
                        i29 = i77 + 1;
                        cCharAt10 = strRl.charAt(i77);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i79;
                        i79 += 13;
                        i77 = i29;
                        c4 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i79);
                    i77 = i29;
                }
                int i80 = i75 - 51;
                int i81 = i77;
                if (i80 == 9 || i80 == 17) {
                    i28 = i3 + 1;
                    objArr[((i66 / 3) * 2) + 1] = objArrN[i3];
                } else {
                    if (i80 == 12 && (rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i28 = i3 + 1;
                        objArr[((i66 / 3) * 2) + 1] = objArrN[i3];
                    }
                    int i82 = iCharAt12 * 2;
                    obj = objArrN[i82];
                    if (obj instanceof Field) {
                        fieldK2 = k(cls, (String) obj);
                        objArrN[i82] = fieldK2;
                    } else {
                        fieldK2 = (Field) obj;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldK2);
                    int i83 = i82 + 1;
                    obj2 = objArrN[i83];
                    if (obj2 instanceof Field) {
                        fieldK3 = k(cls, (String) obj2);
                        objArrN[i83] = fieldK3;
                    } else {
                        fieldK3 = (Field) obj2;
                    }
                    str = strRl;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldK3);
                    i26 = iObjectFieldOffset4;
                    i25 = 0;
                    i21 = iCharAt10;
                    i34 = i81;
                }
                i3 = i28;
                int i822 = iCharAt12 * 2;
                obj = objArrN[i822];
                if (obj instanceof Field) {
                }
                int iObjectFieldOffset42 = (int) unsafe.objectFieldOffset(fieldK2);
                int i832 = i822 + 1;
                obj2 = objArrN[i832];
                if (obj2 instanceof Field) {
                }
                str = strRl;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldK3);
                i26 = iObjectFieldOffset42;
                i25 = 0;
                i21 = iCharAt10;
                i34 = i81;
            } else {
                int i84 = i3 + 1;
                Field fieldK4 = k(cls, (String) objArrN[i3]);
                if (i75 == 9 || i75 == 17) {
                    i21 = iCharAt10;
                    objArr[((i66 / 3) * 2) + 1] = fieldK4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i21 = iCharAt10;
                        i27 = i3 + 2;
                        objArr[((i66 / 3) * 2) + 1] = objArrN[i84];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i21 = iCharAt10;
                        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i27 = i3 + 2;
                            objArr[((i66 / 3) * 2) + 1] = objArrN[i84];
                        }
                    } else if (i75 == 50) {
                        int i85 = i64 + 1;
                        iArr[i64] = i66;
                        int i86 = (i66 / 3) * 2;
                        int i87 = i3 + 2;
                        objArr[i86] = objArrN[i84];
                        if ((iCharAt11 & 2048) != 0) {
                            i22 = i3 + 3;
                            objArr[i86 + 1] = objArrN[i87];
                            i21 = iCharAt10;
                            i64 = i85;
                        } else {
                            i22 = i87;
                            i64 = i85;
                            i21 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                        if ((iCharAt11 & 4096) == 0 || i75 > 17) {
                            str = strRl;
                            i23 = i22;
                            iObjectFieldOffset2 = 1048575;
                            i24 = i20;
                            i25 = 0;
                        } else {
                            int i88 = i20 + 1;
                            int iCharAt13 = strRl.charAt(i20);
                            if (iCharAt13 >= 55296) {
                                int i89 = iCharAt13 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i24 = i88 + 1;
                                    cCharAt9 = strRl.charAt(i88);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i89 |= (cCharAt9 & 8191) << i90;
                                    i90 += 13;
                                    i88 = i24;
                                }
                                iCharAt13 = i89 | (cCharAt9 << i90);
                            } else {
                                i24 = i88;
                            }
                            int i91 = (i8 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrN[i91];
                            str = strRl;
                            if (obj3 instanceof Field) {
                                fieldK = (Field) obj3;
                            } else {
                                fieldK = k(cls, (String) obj3);
                                objArrN[i91] = fieldK;
                            }
                            i23 = i22;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK);
                            i25 = iCharAt13 % 32;
                        }
                        int i92 = iObjectFieldOffset2;
                        if (i75 >= 18 && i75 <= 49) {
                            iArr[i63] = iObjectFieldOffset;
                            i63++;
                        }
                        iObjectFieldOffset3 = i92;
                        i26 = iObjectFieldOffset;
                        i3 = i23;
                        i34 = i24;
                    } else {
                        i21 = iCharAt10;
                    }
                    i22 = i27;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                    if ((iCharAt11 & 4096) == 0) {
                        str = strRl;
                        i23 = i22;
                        iObjectFieldOffset2 = 1048575;
                        i24 = i20;
                        i25 = 0;
                        int i922 = iObjectFieldOffset2;
                        if (i75 >= 18) {
                            iArr[i63] = iObjectFieldOffset;
                            i63++;
                        }
                        iObjectFieldOffset3 = i922;
                        i26 = iObjectFieldOffset;
                        i3 = i23;
                        i34 = i24;
                    }
                }
                i22 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                if ((iCharAt11 & 4096) == 0) {
                }
            }
            int i93 = i66 + 1;
            iArr4[i66] = i21;
            int i94 = i66 + 2;
            int i95 = iObjectFieldOffset3;
            iArr4[i93] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i26;
            i66 += 3;
            iArr4[i94] = (i25 << 20) | i95;
            length = i76;
            iArr3 = iArr4;
            strRl = str;
            c2 = 55296;
        }
        return new MessageSchema(iArr3, objArr, i5, i10, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i9, i62, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code restructure failed: missing block: B:339:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r0 = r10.gh;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (r0 >= r10.qie) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        r4 = r10.gh(r2, r10.mUb[r0], r4, r5, r20);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if (r4 == null) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        r5.HI(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06f7 A[Catch: all -> 0x0718, TRY_LEAVE, TryCatch #26 {all -> 0x0718, blocks: (B:239:0x06f1, B:241:0x06f7, B:252:0x071c, B:253:0x0721), top: B:295:0x06f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0752 A[LOOP:4: B:266:0x074e->B:268:0x0752, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0765  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        UnknownFieldSchema unknownFieldSchema2;
        Object obj2;
        int i2;
        Object objGh;
        Object obj3;
        Object objJ2;
        UnknownFieldSchema unknownFieldSchema3;
        ExtensionSchema extensionSchema2;
        Object objRl;
        UnknownFieldSchema unknownFieldSchema4;
        Object objGh2;
        Reader reader2;
        MessageSchema<T> messageSchema;
        Object obj4;
        Object obj5;
        MessageSchema<T> messageSchema2 = this;
        ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
        FieldSet fieldSetNr = null;
        Object objUo = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int iJ = messageSchema2.J(fieldNumber);
                if (iJ >= 0) {
                    obj3 = obj;
                    ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite2;
                    objJ2 = objUo;
                    unknownFieldSchema3 = unknownFieldSchema;
                    Reader reader3 = reader;
                    try {
                        int iPJg = messageSchema2.pJg(iJ);
                        try {
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            unknownFieldSchema2 = unknownFieldSchema3;
                        }
                        switch (xg(iPJg)) {
                            case 0:
                                UnsafeUtil.p5(obj3, jB(iPJg), reader3.readDouble());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 1:
                                UnsafeUtil.eF(obj3, jB(iPJg), reader3.readFloat());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 2:
                                UnsafeUtil.M(obj3, jB(iPJg), reader3.readInt64());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 3:
                                UnsafeUtil.M(obj3, jB(iPJg), reader3.readUInt64());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 4:
                                UnsafeUtil.E(obj3, jB(iPJg), reader3.readInt32());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 5:
                                UnsafeUtil.M(obj3, jB(iPJg), reader3.readFixed64());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 6:
                                UnsafeUtil.E(obj3, jB(iPJg), reader3.readFixed32());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 7:
                                UnsafeUtil.rV9(obj3, jB(iPJg), reader3.readBool());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 8:
                                messageSchema2.Nxk(obj3, iPJg, reader3);
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 9:
                                MessageLite messageLite = (MessageLite) messageSchema2.s7N(obj3, iJ);
                                reader3.n(messageLite, messageSchema2.ck(iJ), extensionRegistryLite3);
                                messageSchema2.m(obj3, iJ, messageLite);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 10:
                                UnsafeUtil.FX(obj3, jB(iPJg), reader3.readBytes());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 11:
                                UnsafeUtil.E(obj3, jB(iPJg), reader3.readUInt32());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 12:
                                int i3 = reader3.readEnum();
                                Internal.EnumVerifier enumVerifierTy = messageSchema2.ty(iJ);
                                if (enumVerifierTy != null && !enumVerifierTy.isInRange(i3)) {
                                    objUo = SchemaUtil.nHg(obj3, fieldNumber, i3, objJ2, unknownFieldSchema3);
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                }
                                UnsafeUtil.E(obj3, jB(iPJg), i3);
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 13:
                                UnsafeUtil.E(obj3, jB(iPJg), reader3.readSFixed32());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 14:
                                UnsafeUtil.M(obj3, jB(iPJg), reader3.readSFixed64());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 15:
                                UnsafeUtil.E(obj3, jB(iPJg), reader3.readSInt32());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 16:
                                UnsafeUtil.M(obj3, jB(iPJg), reader3.readSInt64());
                                messageSchema2.dR0(obj3, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 17:
                                MessageLite messageLite2 = (MessageLite) messageSchema2.s7N(obj3, iJ);
                                reader3.J2(messageLite2, messageSchema2.ck(iJ), extensionRegistryLite3);
                                messageSchema2.m(obj3, iJ, messageLite2);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 18:
                                reader3.readDoubleList(messageSchema2.ty.t(obj3, jB(iPJg)));
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 19:
                                reader3.readFloatList(messageSchema2.ty.t(obj3, jB(iPJg)));
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 20:
                                reader3.readInt64List(messageSchema2.ty.t(obj3, jB(iPJg)));
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 21:
                                reader3.readUInt64List(messageSchema2.ty.t(obj3, jB(iPJg)));
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 22:
                                reader3.readInt32List(messageSchema2.ty.t(obj3, jB(iPJg)));
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 23:
                                reader3.readFixed64List(messageSchema2.ty.t(obj3, jB(iPJg)));
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 24:
                                reader3.readFixed32List(messageSchema2.ty.t(obj3, jB(iPJg)));
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 25:
                                reader3.readBoolList(messageSchema2.ty.t(obj3, jB(iPJg)));
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 26:
                                messageSchema2.Y(obj3, iPJg, reader3);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 27:
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj2 = obj3;
                                MessageSchema<T> messageSchema3 = messageSchema2;
                                try {
                                    extensionRegistryLite3 = extensionRegistryLite;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    messageSchema2 = messageSchema3;
                                    reader3 = reader3;
                                }
                                try {
                                    messageSchema2.GR(obj2, iPJg, reader3, messageSchema3.ck(iJ), extensionRegistryLite3);
                                    objUo = objJ2;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    objUo = objJ2;
                                    try {
                                        if (unknownFieldSchema2.Ik(reader3)) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 28:
                                reader2 = reader3;
                                messageSchema = messageSchema2;
                                reader2.readBytesList(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 29:
                                reader2 = reader3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj2 = obj3;
                                messageSchema = messageSchema2;
                                try {
                                    try {
                                        reader2.readUInt32List(messageSchema.ty.t(obj2, jB(iPJg)));
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        messageSchema2 = messageSchema;
                                        objUo = objJ2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        messageSchema2 = messageSchema;
                                        objUo = objJ2;
                                        i2 = messageSchema2.gh;
                                        objGh = objUo;
                                        while (i2 < messageSchema2.qie) {
                                        }
                                        UnknownFieldSchema unknownFieldSchema5 = unknownFieldSchema2;
                                        if (objGh != null) {
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    messageSchema2 = messageSchema;
                                    objUo = objJ2;
                                    reader3 = reader2;
                                    if (unknownFieldSchema2.Ik(reader3)) {
                                        if (objUo == null) {
                                            objUo = unknownFieldSchema2.J2(obj2);
                                        }
                                        if (!unknownFieldSchema2.az(objUo, reader3, 0)) {
                                            objGh2 = objUo;
                                            for (int i5 = messageSchema2.gh; i5 < messageSchema2.qie; i5++) {
                                                objGh2 = messageSchema2.gh(obj2, messageSchema2.mUb[i5], objGh2, unknownFieldSchema2, obj);
                                            }
                                            if (objGh2 == null) {
                                                return;
                                            }
                                            unknownFieldSchema2.HI(obj2, objGh2);
                                        }
                                    } else if (!reader3.skipField()) {
                                        objGh2 = objUo;
                                        for (int i7 = messageSchema2.gh; i7 < messageSchema2.qie; i7++) {
                                            objGh2 = messageSchema2.gh(obj2, messageSchema2.mUb[i7], objGh2, unknownFieldSchema2, obj);
                                        }
                                        if (objGh2 == null) {
                                            return;
                                        }
                                        unknownFieldSchema2.HI(obj2, objGh2);
                                    }
                                    break;
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 30:
                                messageSchema = messageSchema2;
                                obj2 = obj3;
                                reader2 = reader3;
                                objUo = objJ2;
                                try {
                                    List listT = messageSchema.ty.t(obj2, jB(iPJg));
                                    reader2.readEnumList(listT);
                                    obj4 = obj2;
                                    try {
                                        objUo = SchemaUtil.g(obj4, fieldNumber, listT, messageSchema.ty(iJ), objUo, unknownFieldSchema);
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        messageSchema2 = messageSchema;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        obj2 = obj4;
                                        messageSchema2 = messageSchema;
                                        reader3 = reader2;
                                        if (unknownFieldSchema2.Ik(reader3)) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj4;
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        messageSchema2 = messageSchema;
                                        i2 = messageSchema2.gh;
                                        objGh = objUo;
                                        while (i2 < messageSchema2.qie) {
                                        }
                                        UnknownFieldSchema unknownFieldSchema52 = unknownFieldSchema2;
                                        if (objGh != null) {
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                    unknownFieldSchema2 = unknownFieldSchema;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    messageSchema2 = messageSchema;
                                    reader3 = reader2;
                                    if (unknownFieldSchema2.Ik(reader3)) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    unknownFieldSchema2 = unknownFieldSchema;
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 31:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readSFixed32List(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 32:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readSFixed64List(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 33:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readSInt32List(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 34:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readSInt64List(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 35:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readDoubleList(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 36:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readFloatList(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 37:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readInt64List(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 38:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readUInt64List(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 39:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readInt32List(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 40:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readFixed64List(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 41:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readFixed32List(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 42:
                                reader2 = reader3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                reader2.readBoolList(messageSchema.ty.t(obj3, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                objJ2 = objUo;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 43:
                                reader2 = reader3;
                                obj2 = obj3;
                                objUo = objJ2;
                                messageSchema = messageSchema2;
                                try {
                                    reader2.readUInt32List(messageSchema.ty.t(obj2, jB(iPJg)));
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    objJ2 = objUo;
                                    messageSchema2 = messageSchema;
                                    objUo = objJ2;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                    unknownFieldSchema2 = unknownFieldSchema;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    messageSchema2 = messageSchema;
                                    reader3 = reader2;
                                    if (unknownFieldSchema2.Ik(reader3)) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    unknownFieldSchema2 = unknownFieldSchema;
                                    messageSchema2 = messageSchema;
                                    i2 = messageSchema2.gh;
                                    objGh = objUo;
                                    while (i2 < messageSchema2.qie) {
                                    }
                                    UnknownFieldSchema unknownFieldSchema522 = unknownFieldSchema2;
                                    if (objGh != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 44:
                                messageSchema = messageSchema2;
                                obj4 = obj3;
                                reader2 = reader3;
                                try {
                                    List listT2 = messageSchema.ty.t(obj4, jB(iPJg));
                                    reader2.readEnumList(listT2);
                                    objUo = objJ2;
                                    try {
                                        objUo = SchemaUtil.g(obj4, fieldNumber, listT2, messageSchema.ty(iJ), objUo, unknownFieldSchema3);
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        messageSchema2 = messageSchema;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        obj2 = obj4;
                                        messageSchema2 = messageSchema;
                                        reader3 = reader2;
                                        if (unknownFieldSchema2.Ik(reader3)) {
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        obj2 = obj4;
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        messageSchema2 = messageSchema;
                                        i2 = messageSchema2.gh;
                                        objGh = objUo;
                                        while (i2 < messageSchema2.qie) {
                                        }
                                        UnknownFieldSchema unknownFieldSchema5222 = unknownFieldSchema2;
                                        if (objGh != null) {
                                        }
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                    objUo = objJ2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    obj2 = obj4;
                                    objUo = objJ2;
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 45:
                                messageSchema = messageSchema2;
                                obj5 = obj3;
                                reader2 = reader3;
                                reader2.readSFixed32List(messageSchema.ty.t(obj5, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 46:
                                messageSchema = messageSchema2;
                                obj5 = obj3;
                                reader2 = reader3;
                                reader2.readSFixed64List(messageSchema.ty.t(obj5, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 47:
                                messageSchema = messageSchema2;
                                obj5 = obj3;
                                reader2 = reader3;
                                reader2.readSInt32List(messageSchema.ty.t(obj5, jB(iPJg)));
                                extensionRegistryLite3 = extensionRegistryLite;
                                messageSchema2 = messageSchema;
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 48:
                                messageSchema = messageSchema2;
                                obj5 = obj3;
                                reader2 = reader3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                try {
                                    reader2.readSInt64List(messageSchema.ty.t(obj5, jB(iPJg)));
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    messageSchema2 = messageSchema;
                                    objUo = objJ2;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused10) {
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    obj2 = obj5;
                                    messageSchema2 = messageSchema;
                                    objUo = objJ2;
                                    reader3 = reader2;
                                    if (unknownFieldSchema2.Ik(reader3)) {
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    obj2 = obj5;
                                    messageSchema2 = messageSchema;
                                    objUo = objJ2;
                                    i2 = messageSchema2.gh;
                                    objGh = objUo;
                                    while (i2 < messageSchema2.qie) {
                                    }
                                    UnknownFieldSchema unknownFieldSchema52222 = unknownFieldSchema2;
                                    if (objGh != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 49:
                                unknownFieldSchema2 = unknownFieldSchema3;
                                try {
                                    obj2 = obj;
                                } catch (Throwable th10) {
                                    th = th10;
                                    messageSchema = messageSchema2;
                                    obj5 = obj;
                                    obj2 = obj5;
                                    messageSchema2 = messageSchema;
                                    objUo = objJ2;
                                    i2 = messageSchema2.gh;
                                    objGh = objUo;
                                    while (i2 < messageSchema2.qie) {
                                    }
                                    UnknownFieldSchema unknownFieldSchema522222 = unknownFieldSchema2;
                                    if (objGh != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    messageSchema2.I(obj2, jB(iPJg), reader, messageSchema2.ck(iJ), extensionRegistryLite);
                                    messageSchema = messageSchema2;
                                    obj5 = obj2;
                                    reader2 = reader;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    messageSchema2 = messageSchema;
                                    objUo = objJ2;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused11) {
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    reader3 = reader;
                                    objUo = objJ2;
                                    if (unknownFieldSchema2.Ik(reader3)) {
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    messageSchema = messageSchema2;
                                    messageSchema2 = messageSchema;
                                    objUo = objJ2;
                                    i2 = messageSchema2.gh;
                                    objGh = objUo;
                                    while (i2 < messageSchema2.qie) {
                                    }
                                    UnknownFieldSchema unknownFieldSchema5222222 = unknownFieldSchema2;
                                    if (objGh != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 50:
                                unknownFieldSchema2 = unknownFieldSchema3;
                                try {
                                    try {
                                        messageSchema2.X(obj3, iJ, messageSchema2.HI(iJ), extensionRegistryLite3, reader);
                                        extensionRegistryLite3 = extensionRegistryLite;
                                        objUo = objJ2;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        obj2 = obj;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused12) {
                                    obj2 = obj;
                                    reader3 = reader;
                                    extensionRegistryLite3 = extensionRegistryLite;
                                    objUo = objJ2;
                                    if (unknownFieldSchema2.Ik(reader3)) {
                                    }
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 51:
                                UnsafeUtil.FX(obj3, jB(iPJg), Double.valueOf(reader3.readDouble()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 52:
                                UnsafeUtil.FX(obj3, jB(iPJg), Float.valueOf(reader3.readFloat()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 53:
                                UnsafeUtil.FX(obj3, jB(iPJg), Long.valueOf(reader3.readInt64()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 54:
                                UnsafeUtil.FX(obj3, jB(iPJg), Long.valueOf(reader3.readUInt64()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 55:
                                UnsafeUtil.FX(obj3, jB(iPJg), Integer.valueOf(reader3.readInt32()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 56:
                                UnsafeUtil.FX(obj3, jB(iPJg), Long.valueOf(reader3.readFixed64()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 57:
                                UnsafeUtil.FX(obj3, jB(iPJg), Integer.valueOf(reader3.readFixed32()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 58:
                                UnsafeUtil.FX(obj3, jB(iPJg), Boolean.valueOf(reader3.readBool()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 59:
                                messageSchema2.Nxk(obj3, iPJg, reader3);
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 60:
                                MessageLite messageLite3 = (MessageLite) messageSchema2.wTp(obj3, fieldNumber, iJ);
                                reader3.n(messageLite3, messageSchema2.ck(iJ), extensionRegistryLite3);
                                messageSchema2.eTf(obj3, fieldNumber, iJ, messageLite3);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 61:
                                UnsafeUtil.FX(obj3, jB(iPJg), reader3.readBytes());
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 62:
                                UnsafeUtil.FX(obj3, jB(iPJg), Integer.valueOf(reader3.readUInt32()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 63:
                                int i8 = reader3.readEnum();
                                Internal.EnumVerifier enumVerifierTy2 = messageSchema2.ty(iJ);
                                if (enumVerifierTy2 != null && !enumVerifierTy2.isInRange(i8)) {
                                    objUo = SchemaUtil.nHg(obj3, fieldNumber, i8, objJ2, unknownFieldSchema3);
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                }
                                UnsafeUtil.FX(obj3, jB(iPJg), Integer.valueOf(i8));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 64:
                                UnsafeUtil.FX(obj3, jB(iPJg), Integer.valueOf(reader3.readSFixed32()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 65:
                                UnsafeUtil.FX(obj3, jB(iPJg), Long.valueOf(reader3.readSFixed64()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 66:
                                UnsafeUtil.FX(obj3, jB(iPJg), Integer.valueOf(reader3.readSInt32()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 67:
                                UnsafeUtil.FX(obj3, jB(iPJg), Long.valueOf(reader3.readSInt64()));
                                messageSchema2.z(obj3, fieldNumber, iJ);
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            case 68:
                                unknownFieldSchema2 = unknownFieldSchema3;
                                try {
                                    MessageLite messageLite4 = (MessageLite) messageSchema2.wTp(obj3, fieldNumber, iJ);
                                    reader3.J2(messageLite4, messageSchema2.ck(iJ), extensionRegistryLite3);
                                    messageSchema2.eTf(obj3, fieldNumber, iJ, messageLite4);
                                    objUo = objJ2;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused13) {
                                    obj2 = obj3;
                                    objUo = objJ2;
                                    if (unknownFieldSchema2.Ik(reader3)) {
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    obj2 = obj3;
                                    objUo = objJ2;
                                    i2 = messageSchema2.gh;
                                    objGh = objUo;
                                    while (i2 < messageSchema2.qie) {
                                    }
                                    UnknownFieldSchema unknownFieldSchema52222222 = unknownFieldSchema2;
                                    if (objGh != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                            default:
                                if (objJ2 == null) {
                                    objJ2 = unknownFieldSchema3.J2(obj3);
                                }
                                if (!unknownFieldSchema3.az(objJ2, reader3, 0)) {
                                    Object objGh3 = objJ2;
                                    for (int i9 = messageSchema2.gh; i9 < messageSchema2.qie; i9++) {
                                        objGh3 = messageSchema2.gh(obj3, messageSchema2.mUb[i9], objGh3, unknownFieldSchema3, obj);
                                    }
                                    if (objGh3 != null) {
                                        unknownFieldSchema3.HI(obj3, objGh3);
                                        return;
                                    }
                                    return;
                                }
                                objUo = objJ2;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                break;
                                break;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        unknownFieldSchema2 = unknownFieldSchema3;
                        obj2 = obj3;
                        objUo = objJ2;
                        i2 = messageSchema2.gh;
                        objGh = objUo;
                        while (i2 < messageSchema2.qie) {
                        }
                        UnknownFieldSchema unknownFieldSchema522222222 = unknownFieldSchema2;
                        if (objGh != null) {
                        }
                        throw th;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        int i10 = messageSchema2.gh;
                        Object objGh4 = objUo;
                        while (i10 < messageSchema2.qie) {
                            objGh4 = messageSchema2.gh(obj, messageSchema2.mUb[i10], objGh4, unknownFieldSchema, obj);
                            i10++;
                            messageSchema2 = messageSchema2;
                        }
                        if (objGh4 != null) {
                            unknownFieldSchema.HI(obj, objGh4);
                        }
                        return;
                    }
                    MessageSchema<T> messageSchema4 = messageSchema2;
                    try {
                        if (messageSchema4.J2) {
                            extensionSchema2 = extensionSchema;
                            objRl = extensionSchema2.rl(extensionRegistryLite2, messageSchema4.f38092O, fieldNumber);
                        } else {
                            extensionSchema2 = extensionSchema;
                            objRl = null;
                        }
                        if (objRl != null) {
                            if (fieldSetNr == null) {
                                try {
                                    fieldSetNr = extensionSchema.nr(obj);
                                } catch (Throwable th15) {
                                    th = th15;
                                    obj2 = obj;
                                    unknownFieldSchema2 = unknownFieldSchema;
                                    messageSchema2 = messageSchema4;
                                }
                            }
                            Object obj6 = objUo;
                            FieldSet fieldSet = fieldSetNr;
                            try {
                                fieldSetNr = fieldSet;
                                objUo = extensionSchema2.Uo(obj, reader, objRl, extensionRegistryLite2, fieldSet, obj6, unknownFieldSchema);
                                extensionRegistryLite2 = extensionRegistryLite2;
                                messageSchema2 = messageSchema4;
                            } catch (Throwable th16) {
                                th = th16;
                                obj2 = obj;
                                objJ2 = obj6;
                                unknownFieldSchema4 = unknownFieldSchema;
                                unknownFieldSchema2 = unknownFieldSchema4;
                                messageSchema2 = messageSchema4;
                                objUo = objJ2;
                                i2 = messageSchema2.gh;
                                objGh = objUo;
                                while (i2 < messageSchema2.qie) {
                                }
                                UnknownFieldSchema unknownFieldSchema5222222222 = unknownFieldSchema2;
                                if (objGh != null) {
                                }
                                throw th;
                            }
                        } else {
                            obj2 = obj;
                            objJ2 = objUo;
                            unknownFieldSchema4 = unknownFieldSchema;
                            ExtensionRegistryLite extensionRegistryLite4 = extensionRegistryLite2;
                            try {
                                if (unknownFieldSchema4.Ik(reader)) {
                                    try {
                                        if (!reader.skipField()) {
                                        }
                                        extensionRegistryLite2 = extensionRegistryLite4;
                                        messageSchema2 = messageSchema4;
                                        objUo = objJ2;
                                    } catch (Throwable th17) {
                                        th = th17;
                                        unknownFieldSchema2 = unknownFieldSchema4;
                                        messageSchema2 = messageSchema4;
                                        objUo = objJ2;
                                        i2 = messageSchema2.gh;
                                        objGh = objUo;
                                        while (i2 < messageSchema2.qie) {
                                        }
                                        UnknownFieldSchema unknownFieldSchema52222222222 = unknownFieldSchema2;
                                        if (objGh != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (objJ2 == null) {
                                        objJ2 = unknownFieldSchema4.J2(obj2);
                                    }
                                    if (!unknownFieldSchema4.az(objJ2, reader, 0)) {
                                    }
                                    extensionRegistryLite2 = extensionRegistryLite4;
                                    messageSchema2 = messageSchema4;
                                    objUo = objJ2;
                                }
                            } catch (Throwable th18) {
                                th = th18;
                                messageSchema2 = messageSchema4;
                                unknownFieldSchema2 = unknownFieldSchema4;
                            }
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        obj3 = obj;
                        objJ2 = objUo;
                        unknownFieldSchema3 = unknownFieldSchema;
                        messageSchema2 = messageSchema4;
                        unknownFieldSchema2 = unknownFieldSchema3;
                        obj2 = obj3;
                    }
                }
                objUo = objJ2;
            } catch (Throwable th20) {
                th = th20;
                unknownFieldSchema2 = unknownFieldSchema;
                obj2 = obj;
            }
            i2 = messageSchema2.gh;
            objGh = objUo;
            while (i2 < messageSchema2.qie) {
                objGh = messageSchema2.gh(obj2, messageSchema2.mUb[i2], objGh, unknownFieldSchema2, obj);
                i2++;
                messageSchema2 = this;
            }
            UnknownFieldSchema unknownFieldSchema522222222222 = unknownFieldSchema2;
            if (objGh != null) {
                unknownFieldSchema522222222222.HI(obj2, objGh);
            }
            throw th;
        }
        unknownFieldSchema2.HI(obj2, objGh2);
    }

    private static boolean fD(int i2) {
        return (i2 & 268435456) != 0;
    }

    private static long jB(int i2) {
        return i2 & 1048575;
    }

    private static int xg(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int M(Object obj, byte[] bArr, int i2, int i3, int i5, ArrayDecoders.Registers registers) {
        Object obj2;
        int i7;
        int i8;
        Unsafe unsafe;
        MessageSchema<T> messageSchema;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayDecoders.Registers registers2;
        Object obj3;
        int iT;
        int i15;
        long j2;
        ArrayDecoders.Registers registers3;
        int i16;
        Unsafe unsafe2;
        int i17;
        byte[] bArr2;
        int i18;
        Unsafe unsafe3;
        ArrayDecoders.Registers registers4;
        Object obj4;
        byte[] bArr3;
        int iV;
        int i19;
        byte[] bArr4;
        int i20;
        ArrayDecoders.Registers registers5;
        int i21;
        int i22;
        MessageSchema<T> messageSchema2 = this;
        Object obj5 = obj;
        byte[] bArr5 = bArr;
        int i23 = i3;
        ArrayDecoders.Registers registers6 = registers;
        J2(obj5);
        Unsafe unsafe4 = f38090o;
        int i24 = -1;
        int iBzg = i2;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1048575;
        while (true) {
            if (iBzg < i23) {
                int iN = iBzg + 1;
                int i30 = bArr5[iBzg];
                if (i30 < 0) {
                    iN = ArrayDecoders.N(i30, bArr5, iN, registers6);
                    i30 = registers6.f37720n;
                }
                int i31 = iN;
                i28 = i30;
                int i32 = (i28 == true ? 1 : 0) >>> 3;
                int i33 = (i28 == true ? 1 : 0) & 7;
                int iD = i32 > i25 ? messageSchema2.D(i32, i26 / 3) : messageSchema2.J(i32);
                if (iD == i24) {
                    i10 = i31;
                    i8 = i29;
                    unsafe = unsafe4;
                    i11 = i24;
                    i12 = i32;
                    i13 = 0;
                    messageSchema = messageSchema2;
                    i14 = i28 == true ? 1 : 0;
                } else {
                    int i34 = messageSchema2.f38093n[iD + 1];
                    int i35 = i24;
                    int iXg = xg(i34);
                    long jJB = jB(i34);
                    if (iXg <= 17) {
                        int i36 = messageSchema2.f38093n[iD + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i29) {
                            i12 = i32;
                            j2 = jJB;
                            if (i29 != 1048575) {
                                unsafe4.putInt(obj5, i29, i27);
                            }
                            i27 = i38 == 1048575 ? 0 : unsafe4.getInt(obj5, i38);
                        } else {
                            j2 = jJB;
                            i12 = i32;
                            i38 = i29;
                        }
                        switch (iXg) {
                            case 0:
                                registers3 = registers;
                                i16 = iD;
                                unsafe2 = unsafe4;
                                i17 = i31;
                                long j3 = j2;
                                bArr2 = bArr;
                                if (i33 == 1) {
                                    UnsafeUtil.p5(obj5, j3, ArrayDecoders.O(bArr2, i17));
                                    i18 = i17 + 8;
                                    i27 |= i37;
                                    Unsafe unsafe5 = unsafe2;
                                    iBzg = i18;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe5;
                                    i23 = i3;
                                    registers6 = registers3;
                                    i29 = i38;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5 || i5 == 0) {
                                        if (!messageSchema.J2 || registers2.nr == ExtensionRegistryLite.rl()) {
                                            obj3 = obj;
                                            iT = ArrayDecoders.T(i14, bArr, i10, i3, Ik(obj3), registers);
                                            i15 = i3;
                                        } else {
                                            iT = ArrayDecoders.KN(i14, bArr, i10, i3, obj, messageSchema.f38092O, messageSchema.HI, registers2);
                                            obj3 = obj;
                                            i15 = i3;
                                        }
                                        iBzg = iT;
                                        bArr5 = bArr;
                                        i28 = i14;
                                        obj5 = obj3;
                                        i23 = i15;
                                        i26 = i13;
                                        messageSchema2 = messageSchema;
                                        i29 = i8;
                                        i24 = i11;
                                        i25 = i12;
                                        unsafe4 = unsafe;
                                        registers6 = registers;
                                    } else {
                                        obj2 = obj;
                                        i7 = i3;
                                        i28 = i14;
                                        i9 = i10;
                                    }
                                }
                                break;
                            case 1:
                                registers3 = registers;
                                i16 = iD;
                                unsafe2 = unsafe4;
                                i17 = i31;
                                long j4 = j2;
                                bArr2 = bArr;
                                if (i33 == 5) {
                                    UnsafeUtil.eF(obj5, j4, ArrayDecoders.az(bArr2, i17));
                                    i18 = i17 + 4;
                                    i27 |= i37;
                                    Unsafe unsafe52 = unsafe2;
                                    iBzg = i18;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe52;
                                    i23 = i3;
                                    registers6 = registers3;
                                    i29 = i38;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    break;
                                } else {
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                        obj3 = obj;
                                        iT = ArrayDecoders.T(i14, bArr, i10, i3, Ik(obj3), registers);
                                        i15 = i3;
                                        iBzg = iT;
                                        bArr5 = bArr;
                                        i28 = i14;
                                        obj5 = obj3;
                                        i23 = i15;
                                        i26 = i13;
                                        messageSchema2 = messageSchema;
                                        i29 = i8;
                                        i24 = i11;
                                        i25 = i12;
                                        unsafe4 = unsafe;
                                        registers6 = registers;
                                        break;
                                    }
                                }
                                break;
                            case 2:
                            case 3:
                                registers3 = registers;
                                i16 = iD;
                                unsafe3 = unsafe4;
                                i17 = i31;
                                long j5 = j2;
                                if (i33 == 0) {
                                    int iV2 = ArrayDecoders.v(bArr, i17, registers3);
                                    Object obj6 = obj5;
                                    unsafe3.putLong(obj6, j5, registers3.rl);
                                    obj5 = obj6;
                                    i27 |= i37;
                                    i23 = i3;
                                    bArr5 = bArr;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    unsafe4 = unsafe3;
                                    iBzg = iV2;
                                    registers6 = registers3;
                                    i29 = i38;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 4:
                            case 11:
                                registers3 = registers;
                                i16 = iD;
                                unsafe3 = unsafe4;
                                i17 = i31;
                                long j6 = j2;
                                if (i33 == 0) {
                                    int iNHg = ArrayDecoders.nHg(bArr, i17, registers3);
                                    unsafe3.putInt(obj5, j6, registers3.f37720n);
                                    i27 |= i37;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr;
                                    i23 = i3;
                                    iBzg = iNHg;
                                    registers6 = registers3;
                                    i29 = i38;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 5:
                            case 14:
                                Object obj7 = obj5;
                                i16 = iD;
                                i17 = i31;
                                long j7 = j2;
                                if (i33 == 1) {
                                    Unsafe unsafe6 = unsafe4;
                                    registers3 = registers;
                                    unsafe6.putLong(obj7, j7, ArrayDecoders.gh(bArr, i17));
                                    obj5 = obj7;
                                    iBzg = i17 + 8;
                                    i27 |= i37;
                                    unsafe4 = unsafe6;
                                    bArr5 = bArr;
                                    i23 = i3;
                                    registers6 = registers3;
                                    i29 = i38;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    registers3 = registers;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 6:
                            case 13:
                                registers4 = registers;
                                obj4 = obj5;
                                i16 = iD;
                                i17 = i31;
                                long j9 = j2;
                                bArr3 = bArr;
                                if (i33 == 5) {
                                    unsafe4.putInt(obj4, j9, ArrayDecoders.xMQ(bArr3, i17));
                                    iV = i17 + 4;
                                    i27 |= i37;
                                    i23 = i3;
                                    registers6 = registers4;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    iBzg = iV;
                                    bArr5 = bArr3;
                                    obj5 = obj4;
                                    i29 = i38;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 7:
                                registers4 = registers;
                                obj4 = obj5;
                                i16 = iD;
                                i19 = i31;
                                long j10 = j2;
                                bArr3 = bArr;
                                if (i33 == 0) {
                                    iV = ArrayDecoders.v(bArr3, i19, registers4);
                                    UnsafeUtil.rV9(obj4, j10, registers4.rl != 0);
                                    i27 |= i37;
                                    i23 = i3;
                                    registers6 = registers4;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    iBzg = iV;
                                    bArr5 = bArr3;
                                    obj5 = obj4;
                                    i29 = i38;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i17 = i19;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 8:
                                registers4 = registers;
                                obj4 = obj5;
                                i16 = iD;
                                i19 = i31;
                                long j11 = j2;
                                bArr3 = bArr;
                                if (i33 == 2) {
                                    iV = Z(i34) ? ArrayDecoders.X(bArr3, i19, registers4) : ArrayDecoders.fD(bArr3, i19, registers4);
                                    unsafe4.putObject(obj4, j11, registers4.f37721t);
                                    i27 |= i37;
                                    i23 = i3;
                                    registers6 = registers4;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    iBzg = iV;
                                    bArr5 = bArr3;
                                    obj5 = obj4;
                                    i29 = i38;
                                    break;
                                } else {
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i17 = i19;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 9:
                                i16 = iD;
                                Unsafe unsafe7 = unsafe4;
                                if (i33 == 2) {
                                    Object obj8 = obj5;
                                    Object objS7N = messageSchema2.s7N(obj8, i16);
                                    obj4 = obj8;
                                    unsafe4 = unsafe7;
                                    iV = ArrayDecoders.Xw(objS7N, messageSchema2.ck(i16), bArr, i31, i3, registers);
                                    bArr3 = bArr;
                                    registers4 = registers;
                                    messageSchema2.m(obj4, i16, objS7N);
                                    i27 |= i37;
                                    i23 = i3;
                                    registers6 = registers4;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    iBzg = iV;
                                    bArr5 = bArr3;
                                    obj5 = obj4;
                                    i29 = i38;
                                    break;
                                } else {
                                    obj4 = obj5;
                                    bArr3 = bArr;
                                    unsafe4 = unsafe7;
                                    i19 = i31;
                                    registers4 = registers;
                                    registers3 = registers4;
                                    unsafe2 = unsafe4;
                                    i17 = i19;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 10:
                                bArr4 = bArr;
                                i16 = iD;
                                unsafe3 = unsafe4;
                                i20 = i31;
                                long j12 = j2;
                                registers5 = registers;
                                if (i33 == 2) {
                                    iBzg = ArrayDecoders.t(bArr4, i20, registers5);
                                    unsafe3.putObject(obj5, j12, registers5.f37721t);
                                    i27 |= i37;
                                    i23 = i3;
                                    registers6 = registers5;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i29 = i38;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    i17 = i20;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 12:
                                bArr4 = bArr;
                                i16 = iD;
                                unsafe3 = unsafe4;
                                i20 = i31;
                                long j13 = j2;
                                registers5 = registers;
                                if (i33 == 0) {
                                    iBzg = ArrayDecoders.nHg(bArr4, i20, registers5);
                                    int i39 = registers5.f37720n;
                                    Internal.EnumVerifier enumVerifierTy = messageSchema2.ty(i16);
                                    if (!aYN(i34) || enumVerifierTy == null || enumVerifierTy.isInRange(i39)) {
                                        unsafe3.putInt(obj5, j13, i39);
                                        i27 |= i37;
                                        i23 = i3;
                                        registers6 = registers5;
                                        i26 = i16;
                                        i24 = i35;
                                        i25 = i12;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i29 = i38;
                                    } else {
                                        Ik(obj5).ty(i28 == true ? 1 : 0, Long.valueOf(i39));
                                        i23 = i3;
                                        registers6 = registers5;
                                        i26 = i16;
                                        i24 = i35;
                                        i25 = i12;
                                        unsafe4 = unsafe3;
                                        bArr5 = bArr4;
                                        i29 = i38;
                                    }
                                    break;
                                } else {
                                    registers3 = registers5;
                                    i17 = i20;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i16 = iD;
                                unsafe3 = unsafe4;
                                i20 = i31;
                                long j14 = j2;
                                registers5 = registers;
                                if (i33 == 0) {
                                    iBzg = ArrayDecoders.nHg(bArr4, i20, registers5);
                                    unsafe3.putInt(obj5, j14, CodedInputStream.t(registers5.f37720n));
                                    i27 |= i37;
                                    i23 = i3;
                                    registers6 = registers5;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i29 = i38;
                                    break;
                                } else {
                                    registers3 = registers5;
                                    i17 = i20;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 16:
                                bArr4 = bArr;
                                i16 = iD;
                                i20 = i31;
                                if (i33 == 0) {
                                    int iV3 = ArrayDecoders.v(bArr4, i20, registers);
                                    Object obj9 = obj5;
                                    Unsafe unsafe8 = unsafe4;
                                    registers5 = registers;
                                    unsafe8.putLong(obj9, j2, CodedInputStream.nr(registers.rl));
                                    unsafe3 = unsafe8;
                                    obj5 = obj9;
                                    i27 |= i37;
                                    i23 = i3;
                                    iBzg = iV3;
                                    registers6 = registers5;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr4;
                                    i29 = i38;
                                    break;
                                } else {
                                    Unsafe unsafe9 = unsafe4;
                                    registers5 = registers;
                                    unsafe3 = unsafe9;
                                    registers3 = registers5;
                                    i17 = i20;
                                    unsafe2 = unsafe3;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            case 17:
                                if (i33 == 3) {
                                    Object objS7N2 = messageSchema2.s7N(obj5, iD);
                                    i16 = iD;
                                    iBzg = ArrayDecoders.bzg(objS7N2, messageSchema2.ck(iD), bArr, i31, i3, (i12 << 3) | 4, registers);
                                    messageSchema2.m(obj5, i16, objS7N2);
                                    i27 |= i37;
                                    i23 = i3;
                                    registers6 = registers;
                                    bArr5 = bArr;
                                    i29 = i38;
                                    i26 = i16;
                                    i24 = i35;
                                    i25 = i12;
                                    break;
                                } else {
                                    i16 = iD;
                                    registers3 = registers;
                                    unsafe2 = unsafe4;
                                    i17 = i31;
                                    messageSchema = messageSchema2;
                                    unsafe = unsafe2;
                                    i8 = i38;
                                    i14 = i28 == true ? 1 : 0;
                                    i10 = i17;
                                    i11 = i35;
                                    registers2 = registers3;
                                    i13 = i16;
                                    if (i14 == i5) {
                                    }
                                    if (messageSchema.J2) {
                                    }
                                }
                                break;
                            default:
                                registers3 = registers;
                                i16 = iD;
                                unsafe2 = unsafe4;
                                i17 = i31;
                                messageSchema = messageSchema2;
                                unsafe = unsafe2;
                                i8 = i38;
                                i14 = i28 == true ? 1 : 0;
                                i10 = i17;
                                i11 = i35;
                                registers2 = registers3;
                                i13 = i16;
                                if (i14 == i5) {
                                }
                                if (messageSchema.J2) {
                                }
                                break;
                        }
                    } else {
                        int i40 = i29;
                        i12 = i32;
                        i13 = iD;
                        Unsafe unsafe10 = unsafe4;
                        if (iXg != 27) {
                            i21 = i31;
                            if (iXg <= 49) {
                                unsafe = unsafe10;
                                i8 = i40;
                                i11 = i35;
                                i22 = i27;
                                int iB = messageSchema2.B(obj, bArr, i21, i3, i28 == true ? 1 : 0, i12, i33, i13, i34, iXg, jJB, registers);
                                i28 = i28 == true ? 1 : 0;
                                if (iB != i21) {
                                    messageSchema2 = this;
                                    obj5 = obj;
                                    bArr5 = bArr;
                                    i23 = i3;
                                    iBzg = iB;
                                    i26 = i13;
                                    i29 = i8;
                                    i27 = i22;
                                    i24 = i11;
                                    i25 = i12;
                                    unsafe4 = unsafe;
                                    registers6 = registers;
                                } else {
                                    messageSchema = this;
                                    i10 = iB;
                                }
                            } else {
                                i28 = i28 == true ? 1 : 0;
                                unsafe = unsafe10;
                                i8 = i40;
                                i11 = i35;
                                i22 = i27;
                                if (iXg != 50) {
                                    registers2 = registers;
                                    int iFX = FX(obj, bArr, i21, i3, i28 == true ? 1 : 0, i12, i33, i34, iXg, jJB, i13, registers2);
                                    messageSchema = this;
                                    i14 = i28 == true ? 1 : 0;
                                    i13 = i13;
                                    if (iFX != i21) {
                                        obj5 = obj;
                                        bArr5 = bArr;
                                        i23 = i3;
                                        iBzg = iFX;
                                        i26 = i13;
                                        registers6 = registers2;
                                        i29 = i8;
                                        i27 = i22;
                                        i24 = i11;
                                        i25 = i12;
                                        i28 = i14 == true ? 1 : 0;
                                        messageSchema2 = messageSchema;
                                    } else {
                                        i10 = iFX;
                                        i27 = i22;
                                        if (i14 == i5) {
                                        }
                                        if (messageSchema.J2) {
                                        }
                                    }
                                } else if (i33 == 2) {
                                    int iE = E(obj, bArr, i21, i3, i13, jJB, registers);
                                    i13 = i13;
                                    if (iE != i21) {
                                        messageSchema2 = this;
                                        obj5 = obj;
                                        bArr5 = bArr;
                                        i23 = i3;
                                        registers6 = registers;
                                        iBzg = iE;
                                        i26 = i13;
                                        i29 = i8;
                                        i27 = i22;
                                        i24 = i11;
                                        i25 = i12;
                                    } else {
                                        messageSchema = this;
                                        i10 = iE;
                                    }
                                } else {
                                    messageSchema = this;
                                    i10 = i21;
                                }
                                unsafe4 = unsafe;
                            }
                        } else if (i33 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity = (Internal.ProtobufList) unsafe10.getObject(obj5, jJB);
                            if (!protobufListMutableCopyWithCapacity.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity.size();
                                protobufListMutableCopyWithCapacity = protobufListMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                unsafe10.putObject(obj5, jJB, protobufListMutableCopyWithCapacity);
                            }
                            unsafe4 = unsafe10;
                            registers6 = registers;
                            i23 = i3;
                            iBzg = ArrayDecoders.r(messageSchema2.ck(i13), i28 == true ? 1 : 0, bArr, i31, i3, protobufListMutableCopyWithCapacity, registers6);
                            i26 = i13;
                            i29 = i40;
                            i24 = i35;
                            i25 = i12;
                            obj5 = obj;
                            bArr5 = bArr;
                        } else {
                            unsafe = unsafe10;
                            i8 = i40;
                            i21 = i31;
                            i11 = i35;
                            i22 = i27;
                            messageSchema = this;
                            i10 = i21;
                        }
                        i14 = i28;
                        i27 = i22;
                    }
                }
                registers2 = registers;
                if (i14 == i5) {
                }
                if (messageSchema.J2) {
                }
            } else {
                obj2 = obj5;
                i7 = i23;
                i8 = i29;
                unsafe = unsafe4;
                messageSchema = messageSchema2;
                i9 = iBzg;
            }
        }
        int i41 = i8;
        if (i41 != 1048575) {
            unsafe.putInt(obj2, i41, i27);
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i42 = messageSchema.gh; i42 < messageSchema.qie; i42++) {
            unknownFieldSetLite = (UnknownFieldSetLite) messageSchema.gh(obj2, messageSchema.mUb[i42], unknownFieldSetLite, messageSchema.HI, obj);
        }
        Object obj10 = obj2;
        MessageSchema<T> messageSchema3 = messageSchema;
        if (unknownFieldSetLite != null) {
            messageSchema3.HI.HI(obj10, unknownFieldSetLite);
        }
        if (i5 == 0) {
            if (i9 != i7) {
                throw InvalidProtocolBufferException.KN();
            }
        } else if (i9 > i7 || i28 != i5) {
            throw InvalidProtocolBufferException.KN();
        }
        return i9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.content.preferences.protobuf.Schema
    public int getSerializedSize(Object obj) {
        int i2;
        int iIk;
        int iViF;
        int iE;
        int iXMQ;
        int iA;
        int iGR;
        MessageSchema<T> messageSchema = this;
        Object obj2 = obj;
        Unsafe unsafe = f38090o;
        int i3 = 1048575;
        int i5 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i5 < messageSchema.f38093n.length) {
            int iPJg = messageSchema.pJg(i5);
            int iXg = xg(iPJg);
            int iXw = messageSchema.Xw(i5);
            int i10 = messageSchema.f38093n[i5 + 2];
            int i11 = i10 & i3;
            if (iXg <= 17) {
                if (i11 != i9) {
                    i7 = i11 == i3 ? 0 : unsafe.getInt(obj2, i11);
                    i9 = i11;
                }
                i2 = 1 << (i10 >>> 20);
            } else {
                i2 = 0;
            }
            int i12 = i8;
            long jJB = jB(iPJg);
            if (iXg < FieldType.xg.n() || iXg > FieldType.mYa.n()) {
                i11 = 0;
            }
            switch (iXg) {
                case 0:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iIk = CodedOutputStream.Ik(iXw, 0.0d);
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 1:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iViF = CodedOutputStream.ViF(iXw, 0.0f);
                        i8 = i12 + iViF;
                        messageSchema = this;
                        obj2 = obj;
                    }
                    messageSchema = this;
                    obj2 = obj;
                    i8 = i12;
                    break;
                case 2:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iE = CodedOutputStream.e(iXw, unsafe.getLong(obj2, jJB));
                        i8 = i12 + iE;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i8 = i12;
                    break;
                case 3:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iE = CodedOutputStream.Nxk(iXw, unsafe.getLong(obj2, jJB));
                        i8 = i12 + iE;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i8 = i12;
                    break;
                case 4:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iE = CodedOutputStream.fD(iXw, unsafe.getInt(obj2, jJB));
                        i8 = i12 + iE;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i8 = i12;
                    break;
                case 5:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iViF = CodedOutputStream.WPU(iXw, 0L);
                        i8 = i12 + iViF;
                        messageSchema = this;
                        obj2 = obj;
                    }
                    messageSchema = this;
                    obj2 = obj;
                    i8 = i12;
                    break;
                case 6:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iViF = CodedOutputStream.XQ(iXw, 0);
                        i8 = i12 + iViF;
                        messageSchema = this;
                        obj2 = obj;
                    }
                    messageSchema = this;
                    obj2 = obj;
                    i8 = i12;
                    break;
                case 7:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iViF = CodedOutputStream.qie(iXw, true);
                        i8 = i12 + iViF;
                        messageSchema = this;
                        obj2 = obj;
                    }
                    messageSchema = this;
                    obj2 = obj;
                    i8 = i12;
                    break;
                case 8:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        Object object = unsafe.getObject(obj2, jJB);
                        iE = object instanceof ByteString ? CodedOutputStream.HI(iXw, (ByteString) object) : CodedOutputStream.J(iXw, (String) object);
                        i8 = i12 + iE;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i8 = i12;
                    break;
                case 9:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iIk = SchemaUtil.HI(iXw, unsafe.getObject(obj2, jJB), messageSchema.ck(i5));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 10:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iE = CodedOutputStream.HI(iXw, (ByteString) unsafe.getObject(obj2, jJB));
                        i8 = i12 + iE;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i8 = i12;
                    break;
                case 11:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iE = CodedOutputStream.I(iXw, unsafe.getInt(obj2, jJB));
                        i8 = i12 + iE;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i8 = i12;
                    break;
                case 12:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iE = CodedOutputStream.o(iXw, unsafe.getInt(obj2, jJB));
                        i8 = i12 + iE;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i8 = i12;
                    break;
                case 13:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iViF = CodedOutputStream.P5(iXw, 0);
                        i8 = i12 + iViF;
                        messageSchema = this;
                        obj2 = obj;
                    }
                    messageSchema = this;
                    obj2 = obj;
                    i8 = i12;
                    break;
                case 14:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iViF = CodedOutputStream.p5(iXw, 0L);
                        i8 = i12 + iViF;
                        messageSchema = this;
                        obj2 = obj;
                    }
                    messageSchema = this;
                    obj2 = obj;
                    i8 = i12;
                    break;
                case 15:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iE = CodedOutputStream.E(iXw, unsafe.getInt(obj2, jJB));
                        i8 = i12 + iE;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i8 = i12;
                    break;
                case 16:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iE = CodedOutputStream.FX(iXw, unsafe.getLong(obj2, jJB));
                        i8 = i12 + iE;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i8 = i12;
                    break;
                case 17:
                    if (messageSchema.S(obj2, i5, i9, i7, i2)) {
                        iIk = CodedOutputStream.g(iXw, (MessageLite) unsafe.getObject(obj2, jJB), messageSchema.ck(i5));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 18:
                    iIk = SchemaUtil.KN(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 19:
                    iIk = SchemaUtil.J2(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 20:
                    iIk = SchemaUtil.az(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 21:
                    iIk = SchemaUtil.aYN(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 22:
                    iIk = SchemaUtil.gh(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 23:
                    iIk = SchemaUtil.KN(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 24:
                    iIk = SchemaUtil.J2(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 25:
                    iIk = SchemaUtil.n(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 26:
                    iIk = SchemaUtil.XQ(iXw, (List) unsafe.getObject(obj2, jJB));
                    i8 = i12 + iIk;
                    break;
                case 27:
                    iIk = SchemaUtil.ck(iXw, (List) unsafe.getObject(obj2, jJB), messageSchema.ck(i5));
                    i8 = i12 + iIk;
                    break;
                case 28:
                    iIk = SchemaUtil.t(iXw, (List) unsafe.getObject(obj2, jJB));
                    i8 = i12 + iIk;
                    break;
                case 29:
                    iIk = SchemaUtil.S(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 30:
                    iIk = SchemaUtil.nr(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 31:
                    iIk = SchemaUtil.J2(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 32:
                    iIk = SchemaUtil.KN(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 33:
                    iIk = SchemaUtil.Ik(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 34:
                    iIk = SchemaUtil.o(iXw, (List) unsafe.getObject(obj2, jJB), false);
                    i8 = i12 + iIk;
                    break;
                case 35:
                    iXMQ = SchemaUtil.xMQ((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 36:
                    iXMQ = SchemaUtil.Uo((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 37:
                    iXMQ = SchemaUtil.ty((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 38:
                    iXMQ = SchemaUtil.ViF((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 39:
                    iXMQ = SchemaUtil.qie((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 40:
                    iXMQ = SchemaUtil.xMQ((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 41:
                    iXMQ = SchemaUtil.Uo((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 42:
                    iXMQ = SchemaUtil.rl((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 43:
                    iXMQ = SchemaUtil.WPU((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 44:
                    iXMQ = SchemaUtil.O((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 45:
                    iXMQ = SchemaUtil.Uo((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 46:
                    iXMQ = SchemaUtil.xMQ((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 47:
                    iXMQ = SchemaUtil.r((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 48:
                    iXMQ = SchemaUtil.Z((List) unsafe.getObject(obj2, jJB));
                    if (iXMQ > 0) {
                        if (messageSchema.xMQ) {
                            unsafe.putInt(obj2, i11, iXMQ);
                        }
                        iA = CodedOutputStream.a(iXw);
                        iGR = CodedOutputStream.GR(iXMQ);
                        i8 = i12 + iA + iGR + iXMQ;
                    }
                    i8 = i12;
                    break;
                case 49:
                    iIk = SchemaUtil.mUb(iXw, (List) unsafe.getObject(obj2, jJB), messageSchema.ck(i5));
                    i8 = i12 + iIk;
                    break;
                case 50:
                    iIk = messageSchema.Ik.getSerializedSize(iXw, unsafe.getObject(obj2, jJB), messageSchema.HI(i5));
                    i8 = i12 + iIk;
                    break;
                case 51:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.Ik(iXw, 0.0d);
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 52:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.ViF(iXw, 0.0f);
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 53:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.e(iXw, eF(obj2, jJB));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 54:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.Nxk(iXw, eF(obj2, jJB));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 55:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.fD(iXw, p5(obj2, jJB));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 56:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.WPU(iXw, 0L);
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 57:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.XQ(iXw, 0);
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 58:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.qie(iXw, true);
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 59:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        Object object2 = unsafe.getObject(obj2, jJB);
                        iIk = object2 instanceof ByteString ? CodedOutputStream.HI(iXw, (ByteString) object2) : CodedOutputStream.J(iXw, (String) object2);
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 60:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = SchemaUtil.HI(iXw, unsafe.getObject(obj2, jJB), messageSchema.ck(i5));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 61:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.HI(iXw, (ByteString) unsafe.getObject(obj2, jJB));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 62:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.I(iXw, p5(obj2, jJB));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 63:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.o(iXw, p5(obj2, jJB));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 64:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.P5(iXw, 0);
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 65:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.p5(iXw, 0L);
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 66:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.E(iXw, p5(obj2, jJB));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 67:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.FX(iXw, eF(obj2, jJB));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                case 68:
                    if (messageSchema.iF(obj2, iXw, i5)) {
                        iIk = CodedOutputStream.g(iXw, (MessageLite) unsafe.getObject(obj2, jJB), messageSchema.ck(i5));
                        i8 = i12 + iIk;
                    }
                    i8 = i12;
                    break;
                default:
                    i8 = i12;
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int iR = i8 + messageSchema.r(messageSchema.HI, obj2);
        return messageSchema.J2 ? iR + messageSchema.ck.t(obj2).qie() : iR;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public void t(Object obj, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers) {
        M(obj, bArr, i2, i3, 0, registers);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f38095n;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f38095n = iArr;
            try {
                iArr[WireFormat.FieldType.E2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38095n[WireFormat.FieldType.f38209N.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38095n[WireFormat.FieldType.f38210O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38095n[WireFormat.FieldType.f38217g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38095n[WireFormat.FieldType.jB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38095n[WireFormat.FieldType.f38211S.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38095n[WireFormat.FieldType.f38213U.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38095n[WireFormat.FieldType.J2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38095n[WireFormat.FieldType.Xw.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38095n[WireFormat.FieldType.f38215Z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38095n[WireFormat.FieldType.f38220v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38095n[WireFormat.FieldType.f38219r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f38095n[WireFormat.FieldType.f38218o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f38095n[WireFormat.FieldType.f38212T.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f38095n[WireFormat.FieldType.P5.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f38095n[WireFormat.FieldType.M7.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f38095n[WireFormat.FieldType.f38216e.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int B(Object obj, byte[] bArr, int i2, int i3, int i5, int i7, int i8, int i9, long j2, int i10, long j3, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iS7N;
        Unsafe unsafe = f38090o;
        Internal.ProtobufList protobufListMutableCopyWithCapacity = (Internal.ProtobufList) unsafe.getObject(obj, j3);
        if (!protobufListMutableCopyWithCapacity.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity.size();
            protobufListMutableCopyWithCapacity = protobufListMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j3, protobufListMutableCopyWithCapacity);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity;
        switch (i10) {
            case 18:
            case 35:
                if (i8 == 2) {
                    return ArrayDecoders.Z(bArr, i2, protobufList, registers);
                }
                if (i8 == 1) {
                    return ArrayDecoders.J2(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 19:
            case 36:
                if (i8 == 2) {
                    return ArrayDecoders.WPU(bArr, i2, protobufList, registers);
                }
                if (i8 == 5) {
                    return ArrayDecoders.ty(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i8 == 2) {
                    return ArrayDecoders.g(bArr, i2, protobufList, registers);
                }
                if (i8 == 0) {
                    return ArrayDecoders.rV9(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i8 == 2) {
                    return ArrayDecoders.nY(bArr, i2, protobufList, registers);
                }
                if (i8 == 0) {
                    return ArrayDecoders.s7N(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i8 == 2) {
                    return ArrayDecoders.S(bArr, i2, protobufList, registers);
                }
                if (i8 == 1) {
                    return ArrayDecoders.qie(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i8 == 2) {
                    return ArrayDecoders.XQ(bArr, i2, protobufList, registers);
                }
                if (i8 == 5) {
                    return ArrayDecoders.mUb(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 25:
            case 42:
                if (i8 == 2) {
                    return ArrayDecoders.o(bArr, i2, protobufList, registers);
                }
                if (i8 == 0) {
                    return ArrayDecoders.rl(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 26:
                if (i8 == 2) {
                    return (j2 & 536870912) == 0 ? ArrayDecoders.E2(i5, bArr, i2, i3, protobufList, registers) : ArrayDecoders.e(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 27:
                if (i8 == 2) {
                    return ArrayDecoders.r(ck(i9), i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 28:
                if (i8 == 2) {
                    return ArrayDecoders.nr(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 30:
            case 44:
                if (i8 != 2) {
                    if (i8 == 0) {
                        iS7N = ArrayDecoders.s7N(i5, bArr, i2, i3, protobufList, registers);
                    }
                    return i2;
                }
                iS7N = ArrayDecoders.nY(bArr, i2, protobufList, registers);
                SchemaUtil.g(obj, i7, protobufList, ty(i9), null, this.HI);
                return iS7N;
            case 33:
            case 47:
                if (i8 == 2) {
                    return ArrayDecoders.aYN(bArr, i2, protobufList, registers);
                }
                if (i8 == 0) {
                    return ArrayDecoders.te(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 34:
            case 48:
                if (i8 == 2) {
                    return ArrayDecoders.ViF(bArr, i2, protobufList, registers);
                }
                if (i8 == 0) {
                    return ArrayDecoders.iF(i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 49:
                if (i8 == 3) {
                    return ArrayDecoders.ck(ck(i9), i5, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void C(Object obj, Writer writer) {
        Iterator itUo;
        Map.Entry entry;
        fcU(this.HI, obj, writer);
        if (this.J2) {
            FieldSet fieldSetT = this.ck.t(obj);
            if (fieldSetT.ty()) {
                itUo = null;
                entry = null;
            } else {
                itUo = fieldSetT.Uo();
                entry = (Map.Entry) itUo.next();
            }
        }
        for (int length = this.f38093n.length - 3; length >= 0; length -= 3) {
            int iPJg = pJg(length);
            int iXw = Xw(length);
            while (entry != null && this.ck.n(entry) > iXw) {
                this.ck.mUb(writer, entry);
                entry = itUo.hasNext() ? (Map.Entry) itUo.next() : null;
            }
            switch (xg(iPJg)) {
                case 0:
                    if (XQ(obj, length)) {
                        writer.writeDouble(iXw, xMQ(obj, jB(iPJg)));
                    }
                    break;
                case 1:
                    if (XQ(obj, length)) {
                        writer.writeFloat(iXw, az(obj, jB(iPJg)));
                    }
                    break;
                case 2:
                    if (XQ(obj, length)) {
                        writer.writeInt64(iXw, E2(obj, jB(iPJg)));
                    }
                    break;
                case 3:
                    if (XQ(obj, length)) {
                        writer.writeUInt64(iXw, E2(obj, jB(iPJg)));
                    }
                    break;
                case 4:
                    if (XQ(obj, length)) {
                        writer.writeInt32(iXw, o(obj, jB(iPJg)));
                    }
                    break;
                case 5:
                    if (XQ(obj, length)) {
                        writer.writeFixed64(iXw, E2(obj, jB(iPJg)));
                    }
                    break;
                case 6:
                    if (XQ(obj, length)) {
                        writer.writeFixed32(iXw, o(obj, jB(iPJg)));
                    }
                    break;
                case 7:
                    if (XQ(obj, length)) {
                        writer.writeBool(iXw, O(obj, jB(iPJg)));
                    }
                    break;
                case 8:
                    if (XQ(obj, length)) {
                        G7(iXw, UnsafeUtil.T(obj, jB(iPJg)), writer);
                    }
                    break;
                case 9:
                    if (XQ(obj, length)) {
                        writer.t(iXw, UnsafeUtil.T(obj, jB(iPJg)), ck(length));
                    }
                    break;
                case 10:
                    if (XQ(obj, length)) {
                        writer.rl(iXw, (ByteString) UnsafeUtil.T(obj, jB(iPJg)));
                    }
                    break;
                case 11:
                    if (XQ(obj, length)) {
                        writer.writeUInt32(iXw, o(obj, jB(iPJg)));
                    }
                    break;
                case 12:
                    if (XQ(obj, length)) {
                        writer.writeEnum(iXw, o(obj, jB(iPJg)));
                    }
                    break;
                case 13:
                    if (XQ(obj, length)) {
                        writer.writeSFixed32(iXw, o(obj, jB(iPJg)));
                    }
                    break;
                case 14:
                    if (XQ(obj, length)) {
                        writer.writeSFixed64(iXw, E2(obj, jB(iPJg)));
                    }
                    break;
                case 15:
                    if (XQ(obj, length)) {
                        writer.writeSInt32(iXw, o(obj, jB(iPJg)));
                    }
                    break;
                case 16:
                    if (XQ(obj, length)) {
                        writer.writeSInt64(iXw, E2(obj, jB(iPJg)));
                    }
                    break;
                case 17:
                    if (XQ(obj, length)) {
                        writer.O(iXw, UnsafeUtil.T(obj, jB(iPJg)), ck(length));
                    }
                    break;
                case 18:
                    SchemaUtil.bzg(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 19:
                    SchemaUtil.P5(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 20:
                    SchemaUtil.eF(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 21:
                    SchemaUtil.I(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 22:
                    SchemaUtil.p5(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 23:
                    SchemaUtil.U(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 24:
                    SchemaUtil.jB(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 25:
                    SchemaUtil.v(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 26:
                    SchemaUtil.D(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer);
                    break;
                case 27:
                    SchemaUtil.E(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, ck(length));
                    break;
                case 28:
                    SchemaUtil.rV9(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer);
                    break;
                case 29:
                    SchemaUtil.a(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 30:
                    SchemaUtil.Xw(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 31:
                    SchemaUtil.M(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 32:
                    SchemaUtil.FX(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 33:
                    SchemaUtil.B(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 34:
                    SchemaUtil.J(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, false);
                    break;
                case 35:
                    SchemaUtil.bzg(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 36:
                    SchemaUtil.P5(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 37:
                    SchemaUtil.eF(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 38:
                    SchemaUtil.I(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 39:
                    SchemaUtil.p5(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 40:
                    SchemaUtil.U(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 41:
                    SchemaUtil.jB(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 42:
                    SchemaUtil.v(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 43:
                    SchemaUtil.a(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 44:
                    SchemaUtil.Xw(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 45:
                    SchemaUtil.M(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 46:
                    SchemaUtil.FX(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 47:
                    SchemaUtil.B(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 48:
                    SchemaUtil.J(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, true);
                    break;
                case 49:
                    SchemaUtil.M7(Xw(length), (List) UnsafeUtil.T(obj, jB(iPJg)), writer, ck(length));
                    break;
                case 50:
                    Mx(writer, iXw, UnsafeUtil.T(obj, jB(iPJg)), length);
                    break;
                case 51:
                    if (iF(obj, iXw, length)) {
                        writer.writeDouble(iXw, P5(obj, jB(iPJg)));
                    }
                    break;
                case 52:
                    if (iF(obj, iXw, length)) {
                        writer.writeFloat(iXw, M7(obj, jB(iPJg)));
                    }
                    break;
                case 53:
                    if (iF(obj, iXw, length)) {
                        writer.writeInt64(iXw, eF(obj, jB(iPJg)));
                    }
                    break;
                case 54:
                    if (iF(obj, iXw, length)) {
                        writer.writeUInt64(iXw, eF(obj, jB(iPJg)));
                    }
                    break;
                case 55:
                    if (iF(obj, iXw, length)) {
                        writer.writeInt32(iXw, p5(obj, jB(iPJg)));
                    }
                    break;
                case 56:
                    if (iF(obj, iXw, length)) {
                        writer.writeFixed64(iXw, eF(obj, jB(iPJg)));
                    }
                    break;
                case 57:
                    if (iF(obj, iXw, length)) {
                        writer.writeFixed32(iXw, p5(obj, jB(iPJg)));
                    }
                    break;
                case 58:
                    if (iF(obj, iXw, length)) {
                        writer.writeBool(iXw, U(obj, jB(iPJg)));
                    }
                    break;
                case 59:
                    if (iF(obj, iXw, length)) {
                        G7(iXw, UnsafeUtil.T(obj, jB(iPJg)), writer);
                    }
                    break;
                case 60:
                    if (iF(obj, iXw, length)) {
                        writer.t(iXw, UnsafeUtil.T(obj, jB(iPJg)), ck(length));
                    }
                    break;
                case 61:
                    if (iF(obj, iXw, length)) {
                        writer.rl(iXw, (ByteString) UnsafeUtil.T(obj, jB(iPJg)));
                    }
                    break;
                case 62:
                    if (iF(obj, iXw, length)) {
                        writer.writeUInt32(iXw, p5(obj, jB(iPJg)));
                    }
                    break;
                case 63:
                    if (iF(obj, iXw, length)) {
                        writer.writeEnum(iXw, p5(obj, jB(iPJg)));
                    }
                    break;
                case 64:
                    if (iF(obj, iXw, length)) {
                        writer.writeSFixed32(iXw, p5(obj, jB(iPJg)));
                    }
                    break;
                case 65:
                    if (iF(obj, iXw, length)) {
                        writer.writeSFixed64(iXw, eF(obj, jB(iPJg)));
                    }
                    break;
                case 66:
                    if (iF(obj, iXw, length)) {
                        writer.writeSInt32(iXw, p5(obj, jB(iPJg)));
                    }
                    break;
                case 67:
                    if (iF(obj, iXw, length)) {
                        writer.writeSInt64(iXw, eF(obj, jB(iPJg)));
                    }
                    break;
                case 68:
                    if (iF(obj, iXw, length)) {
                        writer.O(iXw, UnsafeUtil.T(obj, jB(iPJg)), ck(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.ck.mUb(writer, entry);
            entry = itUo.hasNext() ? (Map.Entry) itUo.next() : null;
        }
    }

    private int D(int i2, int i3) {
        if (i2 < this.f38094t || i2 > this.nr) {
            return -1;
        }
        return piY(i2, i3);
    }

    private int FX(Object obj, byte[] bArr, int i2, int i3, int i5, int i7, int i8, int i9, int i10, long j2, int i11, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        Unsafe unsafe = f38090o;
        long j3 = this.f38093n[i11 + 2] & 1048575;
        switch (i10) {
            case 51:
                if (i8 != 1) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Double.valueOf(ArrayDecoders.O(bArr, i2)));
                int i12 = i2 + 8;
                unsafe.putInt(obj, j3, i7);
                return i12;
            case 52:
                if (i8 != 5) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Float.valueOf(ArrayDecoders.az(bArr, i2)));
                int i13 = i2 + 4;
                unsafe.putInt(obj, j3, i7);
                return i13;
            case 53:
            case 54:
                if (i8 != 0) {
                    return i2;
                }
                int iV = ArrayDecoders.v(bArr, i2, registers);
                unsafe.putObject(obj, j2, Long.valueOf(registers.rl));
                unsafe.putInt(obj, j3, i7);
                return iV;
            case 55:
            case 62:
                if (i8 != 0) {
                    return i2;
                }
                int iNHg = ArrayDecoders.nHg(bArr, i2, registers);
                unsafe.putObject(obj, j2, Integer.valueOf(registers.f37720n));
                unsafe.putInt(obj, j3, i7);
                return iNHg;
            case 56:
            case 65:
                if (i8 != 1) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Long.valueOf(ArrayDecoders.gh(bArr, i2)));
                int i14 = i2 + 8;
                unsafe.putInt(obj, j3, i7);
                return i14;
            case 57:
            case 64:
                if (i8 != 5) {
                    return i2;
                }
                unsafe.putObject(obj, j2, Integer.valueOf(ArrayDecoders.xMQ(bArr, i2)));
                int i15 = i2 + 4;
                unsafe.putInt(obj, j3, i7);
                return i15;
            case 58:
                if (i8 != 0) {
                    return i2;
                }
                int iV2 = ArrayDecoders.v(bArr, i2, registers);
                unsafe.putObject(obj, j2, Boolean.valueOf(registers.rl != 0));
                unsafe.putInt(obj, j3, i7);
                return iV2;
            case 59:
                if (i8 != 2) {
                    return i2;
                }
                int iNHg2 = ArrayDecoders.nHg(bArr, i2, registers);
                int i16 = registers.f37720n;
                if (i16 == 0) {
                    unsafe.putObject(obj, j2, "");
                } else {
                    if ((i9 & 536870912) != 0 && !Utf8.XQ(bArr, iNHg2, iNHg2 + i16)) {
                        throw InvalidProtocolBufferException.nr();
                    }
                    unsafe.putObject(obj, j2, new String(bArr, iNHg2, i16, Internal.rl));
                    iNHg2 += i16;
                }
                unsafe.putInt(obj, j3, i7);
                return iNHg2;
            case 60:
                if (i8 != 2) {
                    return i2;
                }
                Object objWTp = wTp(obj, i7, i11);
                int iXw = ArrayDecoders.Xw(objWTp, ck(i11), bArr, i2, i3, registers);
                eTf(obj, i7, i11, objWTp);
                return iXw;
            case 61:
                if (i8 != 2) {
                    return i2;
                }
                int iT = ArrayDecoders.t(bArr, i2, registers);
                unsafe.putObject(obj, j2, registers.f37721t);
                unsafe.putInt(obj, j3, i7);
                return iT;
            case 63:
                if (i8 != 0) {
                    return i2;
                }
                int iNHg3 = ArrayDecoders.nHg(bArr, i2, registers);
                int i17 = registers.f37720n;
                Internal.EnumVerifier enumVerifierTy = ty(i11);
                if (enumVerifierTy != null && !enumVerifierTy.isInRange(i17)) {
                    Ik(obj).ty(i5, Long.valueOf(i17));
                    return iNHg3;
                }
                unsafe.putObject(obj, j2, Integer.valueOf(i17));
                unsafe.putInt(obj, j3, i7);
                return iNHg3;
            case 66:
                if (i8 != 0) {
                    return i2;
                }
                int iNHg4 = ArrayDecoders.nHg(bArr, i2, registers);
                unsafe.putObject(obj, j2, Integer.valueOf(CodedInputStream.t(registers.f37720n)));
                unsafe.putInt(obj, j3, i7);
                return iNHg4;
            case 67:
                if (i8 != 0) {
                    return i2;
                }
                int iV3 = ArrayDecoders.v(bArr, i2, registers);
                unsafe.putObject(obj, j2, Long.valueOf(CodedInputStream.nr(registers.rl)));
                unsafe.putInt(obj, j3, i7);
                return iV3;
            case 68:
                if (i8 == 3) {
                    Object objWTp2 = wTp(obj, i7, i11);
                    int iBzg = ArrayDecoders.bzg(objWTp2, ck(i11), bArr, i2, i3, (i5 & (-8)) | 4, registers);
                    eTf(obj, i7, i11, objWTp2);
                    return iBzg;
                }
                break;
        }
        return i2;
    }

    private void G7(int i2, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i2, (String) obj);
        } else {
            writer.rl(i2, (ByteString) obj);
        }
    }

    private Object HI(int i2) {
        return this.rl[(i2 / 3) * 2];
    }

    private void I(Object obj, long j2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.Uo(this.ty.t(obj, j2), schema, extensionRegistryLite);
    }

    static UnknownFieldSetLite Ik(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.t()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteGh = UnknownFieldSetLite.gh();
        generatedMessageLite.unknownFields = unknownFieldSetLiteGh;
        return unknownFieldSetLiteGh;
    }

    private int J(int i2) {
        if (i2 < this.f38094t || i2 > this.nr) {
            return -1;
        }
        return piY(i2, 0);
    }

    private int KN(byte[] bArr, int i2, int i3, WireFormat.FieldType fieldType, Class cls, ArrayDecoders.Registers registers) {
        switch (AnonymousClass1.f38095n[fieldType.ordinal()]) {
            case 1:
                int iV = ArrayDecoders.v(bArr, i2, registers);
                registers.f37721t = Boolean.valueOf(registers.rl != 0);
                return iV;
            case 2:
                return ArrayDecoders.t(bArr, i2, registers);
            case 3:
                registers.f37721t = Double.valueOf(ArrayDecoders.O(bArr, i2));
                return i2 + 8;
            case 4:
            case 5:
                registers.f37721t = Integer.valueOf(ArrayDecoders.xMQ(bArr, i2));
                return i2 + 4;
            case 6:
            case 7:
                registers.f37721t = Long.valueOf(ArrayDecoders.gh(bArr, i2));
                return i2 + 8;
            case 8:
                registers.f37721t = Float.valueOf(ArrayDecoders.az(bArr, i2));
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                int iNHg = ArrayDecoders.nHg(bArr, i2, registers);
                registers.f37721t = Integer.valueOf(registers.f37720n);
                return iNHg;
            case 12:
            case 13:
                int iV2 = ArrayDecoders.v(bArr, i2, registers);
                registers.f37721t = Long.valueOf(registers.rl);
                return iV2;
            case 14:
                return ArrayDecoders.Ik(Protobuf.n().t(cls), bArr, i2, i3, registers);
            case 15:
                int iNHg2 = ArrayDecoders.nHg(bArr, i2, registers);
                registers.f37721t = Integer.valueOf(CodedInputStream.t(registers.f37720n));
                return iNHg2;
            case 16:
                int iV3 = ArrayDecoders.v(bArr, i2, registers);
                registers.f37721t = Long.valueOf(CodedInputStream.nr(registers.rl));
                return iV3;
            case 17:
                return ArrayDecoders.X(bArr, i2, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private void Mx(Writer writer, int i2, Object obj, int i3) {
        if (obj != null) {
            writer.nr(i2, this.Ik.forMapMetadata(HI(i3)), this.Ik.forMapData(obj));
        }
    }

    private int Uo(byte[] bArr, int i2, int i3, MapEntryLite.Metadata metadata, Map map, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iNHg = ArrayDecoders.nHg(bArr, i2, registers);
        int i5 = registers.f37720n;
        if (i5 < 0 || i5 > i3 - iNHg) {
            throw InvalidProtocolBufferException.az();
        }
        int i7 = iNHg + i5;
        Object obj = metadata.rl;
        Object obj2 = metadata.nr;
        while (iNHg < i7) {
            int iN = iNHg + 1;
            int i8 = bArr[iNHg];
            if (i8 < 0) {
                iN = ArrayDecoders.N(i8, bArr, iN, registers);
                i8 = registers.f37720n;
            }
            int i9 = iN;
            int i10 = i8 >>> 3;
            int i11 = i8 & 7;
            if (i10 != 1) {
                if (i10 == 2 && i11 == metadata.f38085t.rl()) {
                    iNHg = KN(bArr, i9, i3, metadata.f38085t, metadata.nr.getClass(), registers);
                    obj2 = registers.f37721t;
                } else {
                    iNHg = ArrayDecoders.jB(i8, bArr, i9, i3, registers);
                }
            } else if (i11 == metadata.f38084n.rl()) {
                iNHg = KN(bArr, i9, i3, metadata.f38084n, null, registers);
                obj = registers.f37721t;
            } else {
                iNHg = ArrayDecoders.jB(i8, bArr, i9, i3, registers);
            }
        }
        if (iNHg != i7) {
            throw InvalidProtocolBufferException.KN();
        }
        map.put(obj, obj2);
        return i7;
    }

    private int Xw(int i2) {
        return this.f38093n[i2];
    }

    private int a(int i2) {
        return this.f38093n[i2 + 2];
    }

    private Schema ck(int i2) {
        int i3 = (i2 / 3) * 2;
        Schema schema = (Schema) this.rl[i3];
        if (schema != null) {
            return schema;
        }
        Schema schemaT = Protobuf.n().t((Class) this.rl[i3 + 1]);
        this.rl[i3] = schemaT;
        return schemaT;
    }

    private void eTf(Object obj, int i2, int i3, Object obj2) {
        f38090o.putObject(obj, jB(pJg(i3)), obj2);
        z(obj, i2, i3);
    }

    private static boolean g(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).te();
        }
        return true;
    }

    private void m(Object obj, int i2, Object obj2) {
        f38090o.putObject(obj, jB(pJg(i2)), obj2);
        dR0(obj, i2);
    }

    private boolean nY(Object obj, int i2, int i3) {
        Map mapForMapData = this.Ik.forMapData(UnsafeUtil.T(obj, jB(i2)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.Ik.forMapMetadata(HI(i3)).f38085t.n() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        Schema schemaT = null;
        for (Object obj2 : mapForMapData.values()) {
            if (schemaT == null) {
                schemaT = Protobuf.n().t(obj2.getClass());
            }
            if (!schemaT.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ofS(Object obj, Writer writer) {
        Map.Entry entry;
        Iterator it;
        boolean z2;
        Map.Entry entry2;
        int i2;
        int i3;
        int i5;
        boolean z3;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.J2) {
            FieldSet fieldSetT = messageSchema.ck.t(obj);
            if (fieldSetT.ty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZ = fieldSetT.Z();
                entry = (Map.Entry) itZ.next();
                it = itZ;
            }
        }
        int length = messageSchema.f38093n.length;
        Unsafe unsafe = f38090o;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int iPJg = messageSchema.pJg(i8);
            int iXw = messageSchema.Xw(i8);
            int iXg = xg(iPJg);
            if (iXg <= 17) {
                int i10 = messageSchema.f38093n[i8 + 2];
                z2 = true;
                int i11 = i10 & 1048575;
                if (i11 != i7) {
                    i9 = i11 == 1048575 ? 0 : unsafe.getInt(obj, i11);
                    i7 = i11;
                }
                int i12 = 1 << (i10 >>> 20);
                entry2 = entry;
                i2 = i7;
                i3 = i9;
                i5 = i12;
            } else {
                z2 = true;
                entry2 = entry;
                i2 = i7;
                i3 = i9;
                i5 = 0;
            }
            while (entry2 != null && messageSchema.ck.n(entry2) <= iXw) {
                messageSchema.ck.mUb(writer, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jJB = jB(iPJg);
            switch (iXg) {
                case 0:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeDouble(iXw, xMQ(obj, jJB));
                    }
                    break;
                case 1:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeFloat(iXw, az(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 2:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeInt64(iXw, unsafe.getLong(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 3:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeUInt64(iXw, unsafe.getLong(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 4:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeInt32(iXw, unsafe.getInt(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 5:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeFixed64(iXw, unsafe.getLong(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 6:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeFixed32(iXw, unsafe.getInt(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 7:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeBool(iXw, O(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 8:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        messageSchema.G7(iXw, unsafe.getObject(obj, jJB), writer);
                    }
                    break;
                case 9:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.t(iXw, unsafe.getObject(obj, jJB), messageSchema.ck(i8));
                    }
                    break;
                case 10:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.rl(iXw, (ByteString) unsafe.getObject(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 11:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeUInt32(iXw, unsafe.getInt(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 12:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeEnum(iXw, unsafe.getInt(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 13:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeSFixed32(iXw, unsafe.getInt(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 14:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeSFixed64(iXw, unsafe.getLong(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 15:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeSInt32(iXw, unsafe.getInt(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 16:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.writeSInt64(iXw, unsafe.getLong(obj, jJB));
                    }
                    messageSchema = this;
                    break;
                case 17:
                    if (messageSchema.S(obj, i8, i2, i3, i5)) {
                        writer.O(iXw, unsafe.getObject(obj, jJB), messageSchema.ck(i8));
                    }
                    break;
                case 18:
                    SchemaUtil.bzg(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 19:
                    SchemaUtil.P5(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 20:
                    SchemaUtil.eF(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 21:
                    SchemaUtil.I(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 22:
                    SchemaUtil.p5(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 23:
                    SchemaUtil.U(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 24:
                    SchemaUtil.jB(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 25:
                    SchemaUtil.v(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 26:
                    SchemaUtil.D(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer);
                    break;
                case 27:
                    SchemaUtil.E(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, messageSchema.ck(i8));
                    break;
                case 28:
                    SchemaUtil.rV9(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer);
                    break;
                case 29:
                    z3 = false;
                    SchemaUtil.a(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 30:
                    z3 = false;
                    SchemaUtil.Xw(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 31:
                    z3 = false;
                    SchemaUtil.M(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 32:
                    z3 = false;
                    SchemaUtil.FX(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 33:
                    z3 = false;
                    SchemaUtil.B(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 34:
                    z3 = false;
                    SchemaUtil.J(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, false);
                    break;
                case 35:
                    SchemaUtil.bzg(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 36:
                    SchemaUtil.P5(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 37:
                    SchemaUtil.eF(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 38:
                    SchemaUtil.I(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 39:
                    SchemaUtil.p5(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 40:
                    SchemaUtil.U(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 41:
                    SchemaUtil.jB(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 42:
                    SchemaUtil.v(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 43:
                    SchemaUtil.a(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 44:
                    SchemaUtil.Xw(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 45:
                    SchemaUtil.M(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 46:
                    SchemaUtil.FX(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 47:
                    SchemaUtil.B(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 48:
                    SchemaUtil.J(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, z2);
                    break;
                case 49:
                    SchemaUtil.M7(messageSchema.Xw(i8), (List) unsafe.getObject(obj, jJB), writer, messageSchema.ck(i8));
                    break;
                case 50:
                    messageSchema.Mx(writer, iXw, unsafe.getObject(obj, jJB), i8);
                    break;
                case 51:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeDouble(iXw, P5(obj, jJB));
                    }
                    break;
                case 52:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeFloat(iXw, M7(obj, jJB));
                    }
                    break;
                case 53:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeInt64(iXw, eF(obj, jJB));
                    }
                    break;
                case 54:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeUInt64(iXw, eF(obj, jJB));
                    }
                    break;
                case 55:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeInt32(iXw, p5(obj, jJB));
                    }
                    break;
                case 56:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeFixed64(iXw, eF(obj, jJB));
                    }
                    break;
                case 57:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeFixed32(iXw, p5(obj, jJB));
                    }
                    break;
                case 58:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeBool(iXw, U(obj, jJB));
                    }
                    break;
                case 59:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        messageSchema.G7(iXw, unsafe.getObject(obj, jJB), writer);
                    }
                    break;
                case 60:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.t(iXw, unsafe.getObject(obj, jJB), messageSchema.ck(i8));
                    }
                    break;
                case 61:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.rl(iXw, (ByteString) unsafe.getObject(obj, jJB));
                    }
                    break;
                case 62:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeUInt32(iXw, p5(obj, jJB));
                    }
                    break;
                case 63:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeEnum(iXw, p5(obj, jJB));
                    }
                    break;
                case 64:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeSFixed32(iXw, p5(obj, jJB));
                    }
                    break;
                case 65:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeSFixed64(iXw, eF(obj, jJB));
                    }
                    break;
                case 66:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeSInt32(iXw, p5(obj, jJB));
                    }
                    break;
                case 67:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.writeSInt64(iXw, eF(obj, jJB));
                    }
                    break;
                case 68:
                    if (messageSchema.iF(obj, iXw, i8)) {
                        writer.O(iXw, unsafe.getObject(obj, jJB), messageSchema.ck(i8));
                    }
                    break;
            }
            i8 += 3;
            i9 = i3;
            i7 = i2;
            entry = entry2;
        }
        while (entry != null) {
            messageSchema.ck.mUb(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        messageSchema.fcU(messageSchema.HI, obj, writer);
    }

    private int pJg(int i2) {
        return this.f38093n[i2 + 1];
    }

    private int piY(int i2, int i3) {
        int length = (this.f38093n.length / 3) - 1;
        while (i3 <= length) {
            int i5 = (length + i3) >>> 1;
            int i7 = i5 * 3;
            int iXw = Xw(i7);
            if (i2 == iXw) {
                return i7;
            }
            if (i2 < iXw) {
                length = i5 - 1;
            } else {
                i3 = i5 + 1;
            }
        }
        return -1;
    }

    private Object qie(int i2, int i3, Map map, Internal.EnumVerifier enumVerifier, Object obj, UnknownFieldSchema unknownFieldSchema, Object obj2) {
        MapEntryLite.Metadata metadataForMapMetadata = this.Ik.forMapMetadata(HI(i2));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifier.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = unknownFieldSchema.J2(obj2);
                }
                ByteString.CodedBuilder codedBuilderWPU = ByteString.WPU(MapEntryLite.rl(metadataForMapMetadata, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.O(codedBuilderWPU.rl(), metadataForMapMetadata, entry.getKey(), entry.getValue());
                    unknownFieldSchema.nr(obj, i3, codedBuilderWPU.n());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return obj;
    }

    private Internal.EnumVerifier ty(int i2) {
        return (Internal.EnumVerifier) this.rl[((i2 / 3) * 2) + 1];
    }

    static MessageSchema v(Class cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? bzg((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : rV9((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public boolean equals(Object obj, Object obj2) {
        int length = this.f38093n.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!mUb(obj, obj2, i2)) {
                return false;
            }
        }
        if (!this.HI.Uo(obj).equals(this.HI.Uo(obj2))) {
            return false;
        }
        if (this.J2) {
            return this.ck.t(obj).equals(this.ck.t(obj2));
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public int hashCode(Object obj) {
        int i2;
        int iJ2;
        int length = this.f38093n.length;
        int i3 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iPJg = pJg(i5);
            int iXw = Xw(i5);
            long jJB = jB(iPJg);
            int iHashCode = 37;
            switch (xg(iPJg)) {
                case 0:
                    i2 = i3 * 53;
                    iJ2 = Internal.J2(Double.doubleToLongBits(UnsafeUtil.te(obj, jJB)));
                    i3 = i2 + iJ2;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iJ2 = Float.floatToIntBits(UnsafeUtil.iF(obj, jJB));
                    i3 = i2 + iJ2;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iJ2 = Internal.J2(UnsafeUtil.e(obj, jJB));
                    i3 = i2 + iJ2;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iJ2 = Internal.J2(UnsafeUtil.e(obj, jJB));
                    i3 = i2 + iJ2;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iJ2 = UnsafeUtil.fD(obj, jJB);
                    i3 = i2 + iJ2;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iJ2 = Internal.J2(UnsafeUtil.e(obj, jJB));
                    i3 = i2 + iJ2;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iJ2 = UnsafeUtil.fD(obj, jJB);
                    i3 = i2 + iJ2;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iJ2 = Internal.t(UnsafeUtil.XQ(obj, jJB));
                    i3 = i2 + iJ2;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iJ2 = ((String) UnsafeUtil.T(obj, jJB)).hashCode();
                    i3 = i2 + iJ2;
                    break;
                case 9:
                    Object objT = UnsafeUtil.T(obj, jJB);
                    if (objT != null) {
                        iHashCode = objT.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iJ2 = UnsafeUtil.T(obj, jJB).hashCode();
                    i3 = i2 + iJ2;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iJ2 = UnsafeUtil.fD(obj, jJB);
                    i3 = i2 + iJ2;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iJ2 = UnsafeUtil.fD(obj, jJB);
                    i3 = i2 + iJ2;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iJ2 = UnsafeUtil.fD(obj, jJB);
                    i3 = i2 + iJ2;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iJ2 = Internal.J2(UnsafeUtil.e(obj, jJB));
                    i3 = i2 + iJ2;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iJ2 = UnsafeUtil.fD(obj, jJB);
                    i3 = i2 + iJ2;
                    break;
                case 16:
                    i2 = i3 * 53;
                    iJ2 = Internal.J2(UnsafeUtil.e(obj, jJB));
                    i3 = i2 + iJ2;
                    break;
                case 17:
                    Object objT2 = UnsafeUtil.T(obj, jJB);
                    if (objT2 != null) {
                        iHashCode = objT2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i3 * 53;
                    iJ2 = UnsafeUtil.T(obj, jJB).hashCode();
                    i3 = i2 + iJ2;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iJ2 = UnsafeUtil.T(obj, jJB).hashCode();
                    i3 = i2 + iJ2;
                    break;
                case 51:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = Internal.J2(Double.doubleToLongBits(P5(obj, jJB)));
                        i3 = i2 + iJ2;
                    }
                    break;
                case 52:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = Float.floatToIntBits(M7(obj, jJB));
                        i3 = i2 + iJ2;
                    }
                    break;
                case 53:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = Internal.J2(eF(obj, jJB));
                        i3 = i2 + iJ2;
                    }
                    break;
                case 54:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = Internal.J2(eF(obj, jJB));
                        i3 = i2 + iJ2;
                    }
                    break;
                case 55:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = p5(obj, jJB);
                        i3 = i2 + iJ2;
                    }
                    break;
                case 56:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = Internal.J2(eF(obj, jJB));
                        i3 = i2 + iJ2;
                    }
                    break;
                case 57:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = p5(obj, jJB);
                        i3 = i2 + iJ2;
                    }
                    break;
                case 58:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = Internal.t(U(obj, jJB));
                        i3 = i2 + iJ2;
                    }
                    break;
                case 59:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = ((String) UnsafeUtil.T(obj, jJB)).hashCode();
                        i3 = i2 + iJ2;
                    }
                    break;
                case 60:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = UnsafeUtil.T(obj, jJB).hashCode();
                        i3 = i2 + iJ2;
                    }
                    break;
                case 61:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = UnsafeUtil.T(obj, jJB).hashCode();
                        i3 = i2 + iJ2;
                    }
                    break;
                case 62:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = p5(obj, jJB);
                        i3 = i2 + iJ2;
                    }
                    break;
                case 63:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = p5(obj, jJB);
                        i3 = i2 + iJ2;
                    }
                    break;
                case 64:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = p5(obj, jJB);
                        i3 = i2 + iJ2;
                    }
                    break;
                case 65:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = Internal.J2(eF(obj, jJB));
                        i3 = i2 + iJ2;
                    }
                    break;
                case 66:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = p5(obj, jJB);
                        i3 = i2 + iJ2;
                    }
                    break;
                case 67:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = Internal.J2(eF(obj, jJB));
                        i3 = i2 + iJ2;
                    }
                    break;
                case 68:
                    if (iF(obj, iXw, i5)) {
                        i2 = i3 * 53;
                        iJ2 = UnsafeUtil.T(obj, jJB).hashCode();
                        i3 = i2 + iJ2;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + this.HI.Uo(obj).hashCode();
        return this.J2 ? (iHashCode2 * 53) + this.ck.t(obj).hashCode() : iHashCode2;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public Object newInstance() {
        return this.az.newInstance(this.f38092O);
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i2, int i3, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z2, int[] iArr2, int i5, int i7, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z3;
        this.f38093n = iArr;
        this.rl = objArr;
        this.f38094t = i2;
        this.nr = i3;
        this.Uo = messageLite instanceof GeneratedMessageLite;
        this.KN = protoSyntax;
        if (extensionSchema != null && extensionSchema.O(messageLite)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.J2 = z3;
        this.xMQ = z2;
        this.mUb = iArr2;
        this.gh = i5;
        this.qie = i7;
        this.az = newInstanceSchema;
        this.ty = listFieldSchema;
        this.HI = unknownFieldSchema;
        this.ck = extensionSchema;
        this.f38092O = messageLite;
        this.Ik = mapFieldSchema;
    }

    private static long E2(Object obj, long j2) {
        return UnsafeUtil.e(obj, j2);
    }

    private void GR(Object obj, int i2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.rl(this.ty.t(obj, jB(i2)), schema, extensionRegistryLite);
    }

    private static void J2(Object obj) {
        if (g(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private static float M7(Object obj, long j2) {
        return ((Float) UnsafeUtil.T(obj, j2)).floatValue();
    }

    private void N(Object obj, Object obj2, int i2) {
        int iXw = Xw(i2);
        if (!iF(obj2, iXw, i2)) {
            return;
        }
        long jJB = jB(pJg(i2));
        Unsafe unsafe = f38090o;
        Object object = unsafe.getObject(obj2, jJB);
        if (object != null) {
            Schema schemaCk = ck(i2);
            if (!iF(obj, iXw, i2)) {
                if (!g(object)) {
                    unsafe.putObject(obj, jJB, object);
                } else {
                    Object objNewInstance = schemaCk.newInstance();
                    schemaCk.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jJB, objNewInstance);
                }
                z(obj, iXw, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jJB);
            if (!g(object2)) {
                Object objNewInstance2 = schemaCk.newInstance();
                schemaCk.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jJB, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaCk.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + Xw(i2) + " is present but null: " + obj2);
    }

    private void Nxk(Object obj, int i2, Reader reader) {
        if (Z(i2)) {
            UnsafeUtil.FX(obj, jB(i2), reader.readStringRequireUtf8());
        } else if (this.Uo) {
            UnsafeUtil.FX(obj, jB(i2), reader.readString());
        } else {
            UnsafeUtil.FX(obj, jB(i2), reader.readBytes());
        }
    }

    private static boolean O(Object obj, long j2) {
        return UnsafeUtil.XQ(obj, j2);
    }

    private static double P5(Object obj, long j2) {
        return ((Double) UnsafeUtil.T(obj, j2)).doubleValue();
    }

    private boolean S(Object obj, int i2, int i3, int i5, int i7) {
        if (i3 == 1048575) {
            return XQ(obj, i2);
        }
        if ((i5 & i7) != 0) {
            return true;
        }
        return false;
    }

    private void T(Object obj, Object obj2, int i2) {
        if (!XQ(obj2, i2)) {
            return;
        }
        long jJB = jB(pJg(i2));
        Unsafe unsafe = f38090o;
        Object object = unsafe.getObject(obj2, jJB);
        if (object != null) {
            Schema schemaCk = ck(i2);
            if (!XQ(obj, i2)) {
                if (!g(object)) {
                    unsafe.putObject(obj, jJB, object);
                } else {
                    Object objNewInstance = schemaCk.newInstance();
                    schemaCk.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jJB, objNewInstance);
                }
                dR0(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jJB);
            if (!g(object2)) {
                Object objNewInstance2 = schemaCk.newInstance();
                schemaCk.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jJB, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaCk.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + Xw(i2) + " is present but null: " + obj2);
    }

    private static boolean U(Object obj, long j2) {
        return ((Boolean) UnsafeUtil.T(obj, j2)).booleanValue();
    }

    private boolean ViF(Object obj, int i2, int i3) {
        List list = (List) UnsafeUtil.T(obj, jB(i2));
        if (list.isEmpty()) {
            return true;
        }
        Schema schemaCk = ck(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!schemaCk.isInitialized(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    private static boolean WPU(Object obj, int i2, Schema schema) {
        return schema.isInitialized(UnsafeUtil.T(obj, jB(i2)));
    }

    private final void X(Object obj, int i2, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long jJB = jB(pJg(i2));
        Object objT = UnsafeUtil.T(obj, jJB);
        if (objT == null) {
            objT = this.Ik.newMapField(obj2);
            UnsafeUtil.FX(obj, jJB, objT);
        } else if (this.Ik.isImmutable(objT)) {
            Object objNewMapField = this.Ik.newMapField(obj2);
            this.Ik.mergeFrom(objNewMapField, objT);
            UnsafeUtil.FX(obj, jJB, objNewMapField);
            objT = objNewMapField;
        }
        reader.O(this.Ik.forMutableMapData(objT), this.Ik.forMapMetadata(obj2), extensionRegistryLite);
    }

    private boolean XQ(Object obj, int i2) {
        int iA = a(i2);
        long j2 = 1048575 & iA;
        if (j2 == 1048575) {
            int iPJg = pJg(i2);
            long jJB = jB(iPJg);
            switch (xg(iPJg)) {
                case 0:
                    if (Double.doubleToRawLongBits(UnsafeUtil.te(obj, jJB)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(UnsafeUtil.iF(obj, jJB)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (UnsafeUtil.e(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (UnsafeUtil.e(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (UnsafeUtil.fD(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (UnsafeUtil.e(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (UnsafeUtil.fD(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return UnsafeUtil.XQ(obj, jJB);
                case 8:
                    Object objT = UnsafeUtil.T(obj, jJB);
                    if (objT instanceof String) {
                        return !((String) objT).isEmpty();
                    }
                    if (objT instanceof ByteString) {
                        return !ByteString.f37740t.equals(objT);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (UnsafeUtil.T(obj, jJB) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !ByteString.f37740t.equals(UnsafeUtil.T(obj, jJB));
                case 11:
                    if (UnsafeUtil.fD(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (UnsafeUtil.fD(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (UnsafeUtil.fD(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (UnsafeUtil.e(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (UnsafeUtil.fD(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (UnsafeUtil.e(obj, jJB) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (UnsafeUtil.T(obj, jJB) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((UnsafeUtil.fD(obj, j2) & (1 << (iA >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private void Y(Object obj, int i2, Reader reader) {
        if (Z(i2)) {
            reader.readStringListRequireUtf8(this.ty.t(obj, jB(i2)));
        } else {
            reader.readStringList(this.ty.t(obj, jB(i2)));
        }
    }

    private static float az(Object obj, long j2) {
        return UnsafeUtil.iF(obj, j2);
    }

    private void dR0(Object obj, int i2) {
        int iA = a(i2);
        long j2 = 1048575 & iA;
        if (j2 == 1048575) {
            return;
        }
        UnsafeUtil.E(obj, j2, (1 << (iA >>> 20)) | UnsafeUtil.fD(obj, j2));
    }

    private static long eF(Object obj, long j2) {
        return ((Long) UnsafeUtil.T(obj, j2)).longValue();
    }

    private void fcU(UnknownFieldSchema unknownFieldSchema, Object obj, Writer writer) {
        unknownFieldSchema.Z(unknownFieldSchema.Uo(obj), writer);
    }

    private Object gh(Object obj, int i2, Object obj2, UnknownFieldSchema unknownFieldSchema, Object obj3) {
        Internal.EnumVerifier enumVerifierTy;
        int iXw = Xw(i2);
        Object objT = UnsafeUtil.T(obj, jB(pJg(i2)));
        if (objT == null || (enumVerifierTy = ty(i2)) == null) {
            return obj2;
        }
        return qie(i2, iXw, this.Ik.forMutableMapData(objT), enumVerifierTy, obj2, unknownFieldSchema, obj3);
    }

    private boolean iF(Object obj, int i2, int i3) {
        if (UnsafeUtil.fD(obj, a(i3) & 1048575) == i2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ijL(FieldInfo fieldInfo, int[] iArr, int i2, Object[] objArr) {
        int iV;
        int iN;
        long jV;
        int iV2;
        int iNumberOfTrailingZeros;
        int i3;
        OneofInfo oneofInfoXMQ = fieldInfo.xMQ();
        int i5 = 0;
        if (oneofInfoXMQ != null) {
            iN = fieldInfo.qie().n() + 51;
            iV = (int) UnsafeUtil.v(oneofInfoXMQ.rl());
            jV = UnsafeUtil.v(oneofInfoXMQ.n());
        } else {
            FieldType fieldTypeQie = fieldInfo.qie();
            iV = (int) UnsafeUtil.v(fieldInfo.nr());
            iN = fieldTypeQie.n();
            if (!fieldTypeQie.rl() && !fieldTypeQie.t()) {
                Field fieldMUb = fieldInfo.mUb();
                if (fieldMUb == null) {
                    iV2 = 1048575;
                } else {
                    iV2 = (int) UnsafeUtil.v(fieldMUb);
                }
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.gh());
            } else if (fieldInfo.rl() == null) {
                iV2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jV = UnsafeUtil.v(fieldInfo.rl());
            }
            iArr[i2] = fieldInfo.J2();
            int i7 = i2 + 1;
            if (!fieldInfo.az()) {
                i3 = 536870912;
            } else {
                i3 = 0;
            }
            if (fieldInfo.ty()) {
                i5 = 268435456;
            }
            iArr[i7] = i5 | i3 | (iN << 20) | iV;
            iArr[i2 + 2] = iV2 | (iNumberOfTrailingZeros << 20);
            Class clsKN = fieldInfo.KN();
            if (fieldInfo.Uo() == null) {
                int i8 = (i2 / 3) * 2;
                objArr[i8] = fieldInfo.Uo();
                if (clsKN != null) {
                    objArr[i8 + 1] = clsKN;
                    return;
                } else {
                    if (fieldInfo.t() != null) {
                        objArr[i8 + 1] = fieldInfo.t();
                        return;
                    }
                    return;
                }
            }
            if (clsKN != null) {
                objArr[((i2 / 3) * 2) + 1] = clsKN;
                return;
            } else {
                if (fieldInfo.t() != null) {
                    objArr[((i2 / 3) * 2) + 1] = fieldInfo.t();
                    return;
                }
                return;
            }
        }
        iV2 = (int) jV;
        iNumberOfTrailingZeros = 0;
        iArr[i2] = fieldInfo.J2();
        int i72 = i2 + 1;
        if (!fieldInfo.az()) {
        }
        if (fieldInfo.ty()) {
        }
        iArr[i72] = i5 | i3 | (iN << 20) | iV;
        iArr[i2 + 2] = iV2 | (iNumberOfTrailingZeros << 20);
        Class clsKN2 = fieldInfo.KN();
        if (fieldInfo.Uo() == null) {
        }
    }

    private static Field k(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private boolean mUb(Object obj, Object obj2, int i2) {
        int iPJg = pJg(i2);
        long jJB = jB(iPJg);
        switch (xg(iPJg)) {
            case 0:
                if (!nr(obj, obj2, i2) || Double.doubleToLongBits(UnsafeUtil.te(obj, jJB)) != Double.doubleToLongBits(UnsafeUtil.te(obj2, jJB))) {
                }
                break;
            case 1:
                if (!nr(obj, obj2, i2) || Float.floatToIntBits(UnsafeUtil.iF(obj, jJB)) != Float.floatToIntBits(UnsafeUtil.iF(obj2, jJB))) {
                }
                break;
            case 2:
                if (!nr(obj, obj2, i2) || UnsafeUtil.e(obj, jJB) != UnsafeUtil.e(obj2, jJB)) {
                }
                break;
            case 3:
                if (!nr(obj, obj2, i2) || UnsafeUtil.e(obj, jJB) != UnsafeUtil.e(obj2, jJB)) {
                }
                break;
            case 4:
                if (!nr(obj, obj2, i2) || UnsafeUtil.fD(obj, jJB) != UnsafeUtil.fD(obj2, jJB)) {
                }
                break;
            case 5:
                if (!nr(obj, obj2, i2) || UnsafeUtil.e(obj, jJB) != UnsafeUtil.e(obj2, jJB)) {
                }
                break;
            case 6:
                if (!nr(obj, obj2, i2) || UnsafeUtil.fD(obj, jJB) != UnsafeUtil.fD(obj2, jJB)) {
                }
                break;
            case 7:
                if (!nr(obj, obj2, i2) || UnsafeUtil.XQ(obj, jJB) != UnsafeUtil.XQ(obj2, jJB)) {
                }
                break;
            case 8:
                if (!nr(obj, obj2, i2) || !SchemaUtil.N(UnsafeUtil.T(obj, jJB), UnsafeUtil.T(obj2, jJB))) {
                }
                break;
            case 9:
                if (!nr(obj, obj2, i2) || !SchemaUtil.N(UnsafeUtil.T(obj, jJB), UnsafeUtil.T(obj2, jJB))) {
                }
                break;
            case 10:
                if (!nr(obj, obj2, i2) || !SchemaUtil.N(UnsafeUtil.T(obj, jJB), UnsafeUtil.T(obj2, jJB))) {
                }
                break;
            case 11:
                if (!nr(obj, obj2, i2) || UnsafeUtil.fD(obj, jJB) != UnsafeUtil.fD(obj2, jJB)) {
                }
                break;
            case 12:
                if (!nr(obj, obj2, i2) || UnsafeUtil.fD(obj, jJB) != UnsafeUtil.fD(obj2, jJB)) {
                }
                break;
            case 13:
                if (!nr(obj, obj2, i2) || UnsafeUtil.fD(obj, jJB) != UnsafeUtil.fD(obj2, jJB)) {
                }
                break;
            case 14:
                if (!nr(obj, obj2, i2) || UnsafeUtil.e(obj, jJB) != UnsafeUtil.e(obj2, jJB)) {
                }
                break;
            case 15:
                if (!nr(obj, obj2, i2) || UnsafeUtil.fD(obj, jJB) != UnsafeUtil.fD(obj2, jJB)) {
                }
                break;
            case 16:
                if (!nr(obj, obj2, i2) || UnsafeUtil.e(obj, jJB) != UnsafeUtil.e(obj2, jJB)) {
                }
                break;
            case 17:
                if (!nr(obj, obj2, i2) || !SchemaUtil.N(UnsafeUtil.T(obj, jJB), UnsafeUtil.T(obj2, jJB))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!te(obj, obj2, i2) || !SchemaUtil.N(UnsafeUtil.T(obj, jJB), UnsafeUtil.T(obj2, jJB))) {
                }
                break;
        }
        return true;
    }

    private void nHg(Object obj, Object obj2, int i2) {
        int iPJg = pJg(i2);
        long jJB = jB(iPJg);
        int iXw = Xw(i2);
        switch (xg(iPJg)) {
            case 0:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.p5(obj, jJB, UnsafeUtil.te(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 1:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.eF(obj, jJB, UnsafeUtil.iF(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 2:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.M(obj, jJB, UnsafeUtil.e(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 3:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.M(obj, jJB, UnsafeUtil.e(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 4:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.E(obj, jJB, UnsafeUtil.fD(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 5:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.M(obj, jJB, UnsafeUtil.e(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 6:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.E(obj, jJB, UnsafeUtil.fD(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 7:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.rV9(obj, jJB, UnsafeUtil.XQ(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 8:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.FX(obj, jJB, UnsafeUtil.T(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 9:
                T(obj, obj2, i2);
                break;
            case 10:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.FX(obj, jJB, UnsafeUtil.T(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 11:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.E(obj, jJB, UnsafeUtil.fD(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 12:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.E(obj, jJB, UnsafeUtil.fD(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 13:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.E(obj, jJB, UnsafeUtil.fD(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 14:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.M(obj, jJB, UnsafeUtil.e(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 15:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.E(obj, jJB, UnsafeUtil.fD(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 16:
                if (XQ(obj2, i2)) {
                    UnsafeUtil.M(obj, jJB, UnsafeUtil.e(obj2, jJB));
                    dR0(obj, i2);
                }
                break;
            case 17:
                T(obj, obj2, i2);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.ty.rl(obj, obj2, jJB);
                break;
            case 50:
                SchemaUtil.e(this.Ik, obj, obj2, jJB);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (iF(obj2, iXw, i2)) {
                    UnsafeUtil.FX(obj, jJB, UnsafeUtil.T(obj2, jJB));
                    z(obj, iXw, i2);
                }
                break;
            case 60:
                N(obj, obj2, i2);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (iF(obj2, iXw, i2)) {
                    UnsafeUtil.FX(obj, jJB, UnsafeUtil.T(obj2, jJB));
                    z(obj, iXw, i2);
                }
                break;
            case 68:
                N(obj, obj2, i2);
                break;
        }
    }

    private boolean nr(Object obj, Object obj2, int i2) {
        if (XQ(obj, i2) == XQ(obj2, i2)) {
            return true;
        }
        return false;
    }

    private static int o(Object obj, long j2) {
        return UnsafeUtil.fD(obj, j2);
    }

    private static int p5(Object obj, long j2) {
        return ((Integer) UnsafeUtil.T(obj, j2)).intValue();
    }

    private int r(UnknownFieldSchema unknownFieldSchema, Object obj) {
        return unknownFieldSchema.KN(unknownFieldSchema.Uo(obj));
    }

    static MessageSchema rV9(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int iJ2;
        int iJ22;
        int[] iArr;
        int i2;
        FieldInfo[] fieldInfoArrRl = structuralMessageInfo.rl();
        if (fieldInfoArrRl.length == 0) {
            iJ2 = 0;
            iJ22 = 0;
        } else {
            iJ2 = fieldInfoArrRl[0].J2();
            iJ22 = fieldInfoArrRl[fieldInfoArrRl.length - 1].J2();
        }
        int length = fieldInfoArrRl.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i3 = 0;
        int i5 = 0;
        for (FieldInfo fieldInfo : fieldInfoArrRl) {
            if (fieldInfo.qie() == FieldType.HV) {
                i3++;
            } else if (fieldInfo.qie().n() >= 18 && fieldInfo.qie().n() <= 49) {
                i5++;
            }
        }
        int[] iArr3 = null;
        if (i3 > 0) {
            iArr = new int[i3];
        } else {
            iArr = null;
        }
        if (i5 > 0) {
            iArr3 = new int[i5];
        }
        int[] iArrN = structuralMessageInfo.n();
        if (iArrN == null) {
            iArrN = f38091r;
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < fieldInfoArrRl.length) {
            FieldInfo fieldInfo2 = fieldInfoArrRl[i7];
            int iJ23 = fieldInfo2.J2();
            ijL(fieldInfo2, iArr2, i8, objArr);
            if (i9 < iArrN.length && iArrN[i9] == iJ23) {
                iArrN[i9] = i8;
                i9++;
            }
            if (fieldInfo2.qie() == FieldType.HV) {
                iArr[i10] = i8;
                i10++;
            } else {
                if (fieldInfo2.qie().n() >= 18 && fieldInfo2.qie().n() <= 49) {
                    i2 = i8;
                    iArr3[i11] = (int) UnsafeUtil.v(fieldInfo2.nr());
                    i11++;
                }
                i7++;
                i8 = i2 + 3;
            }
            i2 = i8;
            i7++;
            i8 = i2 + 3;
        }
        if (iArr == null) {
            iArr = f38091r;
        }
        if (iArr3 == null) {
            iArr3 = f38091r;
        }
        int[] iArr4 = new int[iArrN.length + iArr.length + iArr3.length];
        System.arraycopy(iArrN, 0, iArr4, 0, iArrN.length);
        System.arraycopy(iArr, 0, iArr4, iArrN.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, iArrN.length + iArr.length, iArr3.length);
        return new MessageSchema(iArr2, objArr, iJ2, iJ22, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, iArrN.length, iArrN.length + iArr.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private Object s7N(Object obj, int i2) {
        Schema schemaCk = ck(i2);
        long jJB = jB(pJg(i2));
        if (!XQ(obj, i2)) {
            return schemaCk.newInstance();
        }
        Object object = f38090o.getObject(obj, jJB);
        if (g(object)) {
            return object;
        }
        Object objNewInstance = schemaCk.newInstance();
        if (object != null) {
            schemaCk.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private boolean te(Object obj, Object obj2, int i2) {
        long jA = a(i2) & 1048575;
        if (UnsafeUtil.fD(obj, jA) == UnsafeUtil.fD(obj2, jA)) {
            return true;
        }
        return false;
    }

    private Object wTp(Object obj, int i2, int i3) {
        Schema schemaCk = ck(i3);
        if (!iF(obj, i2, i3)) {
            return schemaCk.newInstance();
        }
        Object object = f38090o.getObject(obj, jB(pJg(i3)));
        if (g(object)) {
            return object;
        }
        Object objNewInstance = schemaCk.newInstance();
        if (object != null) {
            schemaCk.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private static double xMQ(Object obj, long j2) {
        return UnsafeUtil.te(obj, j2);
    }

    private void z(Object obj, int i2, int i3) {
        UnsafeUtil.E(obj, a(i3) & 1048575, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // androidx.content.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isInitialized(Object obj) {
        int i2;
        int i3;
        int i5 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.gh) {
            int i9 = this.mUb[i7];
            int iXw = Xw(i9);
            int iPJg = pJg(i9);
            int i10 = this.f38093n[i9 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i8 = f38090o.getInt(obj, i11);
                }
                i3 = i8;
                i2 = i11;
            } else {
                i2 = i5;
                i3 = i8;
            }
            Object obj2 = obj;
            if (fD(iPJg) && !S(obj2, i9, i2, i3, i12)) {
                return false;
            }
            int iXg = xg(iPJg);
            if (iXg != 9 && iXg != 17) {
                if (iXg != 27) {
                    if (iXg != 60 && iXg != 68) {
                        if (iXg != 49) {
                            if (iXg == 50 && !nY(obj2, iPJg, i9)) {
                                return false;
                            }
                        }
                    } else if (iF(obj2, iXw, i9) && !WPU(obj2, iPJg, ck(i9))) {
                        return false;
                    }
                } else if (!ViF(obj2, iPJg, i9)) {
                    return false;
                }
            } else if (S(obj2, i9, i2, i3, i12) && !WPU(obj2, iPJg, ck(i9))) {
                return false;
            }
            i7++;
            obj = obj2;
            i5 = i2;
            i8 = i3;
        }
        Object obj3 = obj;
        if (this.J2 && !this.ck.t(obj3).ck()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // androidx.content.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void makeImmutable(Object obj) {
        if (g(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.az();
                generatedMessageLite.qie();
                generatedMessageLite.fD();
            }
            int length = this.f38093n.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int iPJg = pJg(i2);
                long jJB = jB(iPJg);
                int iXg = xg(iPJg);
                if (iXg != 9) {
                    if (iXg != 60 && iXg != 68) {
                        switch (iXg) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.ty.n(obj, jJB);
                                break;
                            case 50:
                                Unsafe unsafe = f38090o;
                                Object object = unsafe.getObject(obj, jJB);
                                if (object != null) {
                                    unsafe.putObject(obj, jJB, this.Ik.toImmutable(object));
                                }
                                break;
                        }
                    } else if (iF(obj, Xw(i2), i2)) {
                        ck(i2).makeImmutable(f38090o.getObject(obj, jJB));
                    }
                } else if (XQ(obj, i2)) {
                    ck(i2).makeImmutable(f38090o.getObject(obj, jJB));
                }
            }
            this.HI.mUb(obj);
            if (this.J2) {
                this.ck.J2(obj);
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public void mergeFrom(Object obj, Object obj2) {
        J2(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.f38093n.length; i2 += 3) {
            nHg(obj, obj2, i2);
        }
        SchemaUtil.X(this.HI, obj, obj2);
        if (this.J2) {
            SchemaUtil.E2(this.ck, obj, obj2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public void n(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        J2(obj);
        e(this.HI, this.ck, obj, reader, extensionRegistryLite);
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public void rl(Object obj, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            C(obj, writer);
        } else {
            ofS(obj, writer);
        }
    }
}
