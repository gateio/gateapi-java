
# Loan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Loan ID |  [optional]
**createTime** | **String** | Creation time |  [optional]
**expireTime** | **String** | Repay time of the loan. No value will be returned for lending loan |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Loan status  open - not fully loaned loaned - all loaned out for lending loan; loaned in for borrowing side finished - loan is finished, either being all repaid or cancelled by the lender auto_repaid - automatically repaid by the system |  [optional]
**side** | [**SideEnum**](#SideEnum) | Loan side | 
**currency** | **String** | Loan currency | 
**rate** | **String** | Loan rate | 
**amount** | **String** | Loan amount | 
**days** | **Integer** | Loan days | 
**autoRenew** | **Boolean** | Auto renew the loan on expiration |  [optional]
**currencyPair** | **String** | Currency pair. Required for borrowing side |  [optional]
**left** | **String** | Amount not lending out |  [optional]
**repaid** | **String** | Repaid amount |  [optional]
**paidInterest** | **String** | Repaid interest |  [optional]
**unpaidInterest** | **String** | Interest not repaid |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
LOANED | &quot;loaned&quot;
FINISHED | &quot;finished&quot;
AUTO_REPAID | &quot;auto_repaid&quot;


<a name="SideEnum"></a>
## Enum: SideEnum
Name | Value
---- | -----
LEND | &quot;lend&quot;
BORROW | &quot;borrow&quot;



