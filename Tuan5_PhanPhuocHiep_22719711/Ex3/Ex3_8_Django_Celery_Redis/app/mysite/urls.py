from django.http import JsonResponse
from django.urls import path


def index(request):
    return JsonResponse({'status': 'ok', 'service': 'django'})


urlpatterns = [
    path('', index),
]
