<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="<%= request.getContextPath() %>/assets/bootstrap/css/bootstrap.min.css">
    
    <title>Header with Bootstrap</title>
</head>

<body>
    <jsp:include page="/header.jsp" />

    <section>
        <div class="container py-5">
            <header>
                <h2 class="display-4">certification genarate </h2>
                <p class="lead text-muted">
                    Lorem ipsum, dolor sit amet consectetur adipisicing elit. Itaque praesentium cumque iure
                    dicta incidunt est ipsam, officia dolor fugit natus?
                </p>
            </header>

            <div class="mt-4 d-block d-lg-none">
                <button class="btn btn-link text-decoration-none d-flex align-items-center">
                    <span class="fs-5"> get </span>
                    <svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em" fill="currentColor" class="bi bi-chevron-down" viewBox="0 0 16 16">
                        <path d="M1 4.5l7 7 7-7h-14z"/>
                    </svg>
                </button>
            </div>

        
        </div>
    </section>

    <!-- Bootstrap JS -->
    <script src="<%= request.getContextPath() %>/assets/bootstrap/js/bootstrap.bundle.min.js" defer></script>
</body>

</html>
