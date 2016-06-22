<!-- jQuery -->
<script src="vendors/jquery/dist/jquery.min.js"></script>

<!-- Bootstrap -->
<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- FastClick -->
<script src="vendors/fastclick/lib/fastclick.js"></script>

<!-- NProgress -->
<script src="vendors/nprogress/nprogress.js"></script>

<!-- Custom Theme Scripts -->
<script src="js/custom.min.js"></script>

<!-- Select2 -->
<script src="vendors/select2/dist/js/select2.full.min.js"></script>

<!-- Select2 -->
<script>
    $(document).ready(function() {
        $(".select2_single").select2({
            placeholder: "Select a state",
            allowClear: true
        });
        $(".select2_group").select2({});
        $(".select2_multiple").select2({
            maximumSelectionLength: 4,
            placeholder: "With Max Selection limit 4",
            allowClear: true
        });
    });
</script>
<!-- /Select2 -->