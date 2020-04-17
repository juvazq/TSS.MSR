package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>

/**
 *  Underlying type comment: These are the RSA encryption schemes that only need a hash algorithm as
 *  a controlling parameter.
 */
public class TPMS_SCHEME_RSAES extends TpmStructure implements TPMU_ASYM_SCHEME 
{
    public TPMS_SCHEME_RSAES() {}
    
    @Override
    public byte[] toTpm() 
    {
        OutByteBuf buf = new OutByteBuf();
        toTpm(buf);
        return buf.getBuf();
    }

    public static TPMS_SCHEME_RSAES fromTpm (byte[] x) 
    {
        TPMS_SCHEME_RSAES ret = new TPMS_SCHEME_RSAES();
        InByteBuf buf = new InByteBuf(x);
        ret.initFromTpm(buf);
        if (buf.bytesRemaining()!=0)
            throw new AssertionError("bytes remaining in buffer after object was de-serialized");
        return ret;
    }

    public static TPMS_SCHEME_RSAES fromTpm (InByteBuf buf) 
    {
        TPMS_SCHEME_RSAES ret = new TPMS_SCHEME_RSAES();
        ret.initFromTpm(buf);
        return ret;
    }

    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPMS_SCHEME_RSAES");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }

    @Override
    public void toStringInternal(TpmStructurePrinter _p, int d)
    {
    }
}

//<<<

