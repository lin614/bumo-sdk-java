package org.bumo.sdk.core.adapter.bc.response.test;

import org.bumo.sdk.core.adapter.bc.response.Transaction;
/***
 * 评估费用
 * @author 布萌
 *
 */
public class TestTransaction extends Transaction {
	private EvalTxResult result;

	public EvalTxResult getResult() {
		return result;
	}

	public void setResult(EvalTxResult result) {
		this.result = result;
	}
	
}