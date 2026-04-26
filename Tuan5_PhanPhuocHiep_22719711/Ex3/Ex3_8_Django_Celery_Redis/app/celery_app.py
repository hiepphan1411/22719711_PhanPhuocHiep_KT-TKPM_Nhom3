import os
from celery import Celery

broker = os.getenv('CELERY_BROKER', 'redis://redis:6379/0')
backend = os.getenv('CELERY_BACKEND', broker)

app = Celery('tasks', broker=broker, backend=backend)


@app.task
def send_email(to, subject):
    return f"Email sent to {to}: {subject}"
