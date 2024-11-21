import org.jetbrains.annotations.NotNull;

public class controller {
    @GetMapping(value = "/vi/revoke-access", produces = MedisType.APPLICATION_JSON_VALUE)
    public ResponseEntity<object> revokeEventAccess(

            @RequestParan(value = "id") @NotNull String id,

    @RequestParam(value = Constants.ONBOARDING_ID) String onboardingid) {

        if (id.isBlank()) {

            Log.info(" user id :"+id);

            throw new BadRequestException(Constants.REQUEST BODY CANNOT BE EMPTY);
            try{



            UserOnboarding userOnboarding useronboardingservice.revokatventAccess (onboardingia, id);

            $1 (userOnboarding.getIsActive()) 4

            String name = userOnboardingService.getName(id);

            String eventDetails = "Revoke access for + name



            userOnboarding.getUserId();

            CommonAuditTrail commonAuditTrail = commonAuditTrailService.addAuditTrail (onboardingid, eventDetails,

                    CommonConstants.USER ACCESS_REVOKED, currentUser; null,

                    (userOnboarding.getCreatedBy() is null ? userOnboarding,getcreatedBy();")

            auditDetely nutt, (userOnboarding.getDetails() != null ? userOnboarding.getDetails() : ""));

            Log.info("Audit to Revoke-Acesse:: () ()", commonAuditTrail.getDescription(), commonAuditTrail.getCreatedByName()); return new ResponseEntity<>( body, "Sucessfully Revoked Access for " + name, HttpStatus.CREATED);

        } catch (Exception e)

        Log.error("Error occured in Revoke Access Controller");
}
