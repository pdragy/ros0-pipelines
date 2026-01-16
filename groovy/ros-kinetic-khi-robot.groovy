node {
    git url: 'https://github.com/Kawasaki-Robotics/khi_robot.git', branch: 'master'
    registerROS('ros:kinetic-ros-base', [
        'libopenblas-dev',
        'ros-kinetic-controller-manager',
        'ros-kinetic-diagnostic-updater',
        'ros-kinetic-joint-limits-interface',
        'ros-kinetic-moveit-core',
        'ros-kinetic-realtime-tools',
        'ros-kinetic-tf-conversions',
        'ros-kinetic-transmission-interface'
    ], [])
}
